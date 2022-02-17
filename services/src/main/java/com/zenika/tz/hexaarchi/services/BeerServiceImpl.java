package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;
import com.zenika.tz.hexaarchi.mapper.BeerMapper;
import com.zenika.tz.hexaarchi.spi.IBeerRepositoryPort;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    private final IBeerRepositoryPort beerRepository;

    private final BeerMapper beerMapper = Mappers.getMapper(BeerMapper.class);

    private final IPARule ipaRule;

    public BeerServiceImpl(final IBeerRepositoryPort beerRepository, final IPARule ipaRule) {
        this.beerRepository = beerRepository;
        this.ipaRule = ipaRule;
    }

    @Override
    public ResponseBeerDTO create(final CreateBeerDTO createBeerDTO) {
        Beer beerEntity = beerMapper.toBeer(createBeerDTO);
        String ipaType = ipaRule.determineIPA(createBeerDTO.alcool(), createBeerDTO.ibu());
        beerEntity.setType(ipaType);
        Beer beerSaved = beerRepository.save(beerEntity);
        return beerMapper.toResponseBeerDTO(beerSaved);
    }
}
