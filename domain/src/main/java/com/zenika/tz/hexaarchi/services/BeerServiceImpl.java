package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.domain.CreateBeer;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepositoryPort beerRepository;


    private final IPARule ipaRule;

    public BeerServiceImpl(final BeerRepositoryPort beerRepository, final IPARule ipaRule) {
        this.beerRepository = beerRepository;
        this.ipaRule = ipaRule;
    }

    @Override
    public Beer create(final CreateBeer createBeer) {
        String ipaType = ipaRule.determineIPA(createBeer.alcool(), createBeer.ibu());
        Beer beerToSave = new Beer(null, createBeer.name(), createBeer.brewery(), ipaType);
        return beerRepository.save(beerToSave);
    }
}
