package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.domain.CreateBeer;

public class BeerServiceImpl implements BeerService {

    private final BeerRepositoryPort beerRepository;
    private final IPARule ipaRule = new IPARuleImpl();

    public BeerServiceImpl(final BeerRepositoryPort beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public Beer create(final CreateBeer createBeer) {
        String ipaType = ipaRule.determineIPAType(createBeer.alcool(), createBeer.ibu());
        Beer beerToSave = new Beer(null, createBeer.name(), createBeer.brewery(), ipaType);
        return beerRepository.save(beerToSave);
    }
}
