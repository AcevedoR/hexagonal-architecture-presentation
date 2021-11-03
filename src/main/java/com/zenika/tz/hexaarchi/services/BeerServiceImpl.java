package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.dao.BeerRepository;
import com.zenika.tz.hexaarchi.entity.BeerEntity;
import com.zenika.tz.hexaarchi.mapper.BeerMapper;
import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;

    private final BeerMapper beerMapper = Mappers.getMapper(BeerMapper.class);

    private final IPARule ipaRule;

    public BeerServiceImpl(final BeerRepository beerRepository, final IPARule ipaRule) {
        this.beerRepository = beerRepository;
        this.ipaRule = ipaRule;
    }

    @Override
    public ResponseBeerDTO create(final CreateBeerDTO createBeerDTO) {
        BeerEntity beerEntity = beerMapper.toEntity(createBeerDTO);
        String ipaType = ipaRule.determineIPA(createBeerDTO.alcool(), createBeerDTO.ibu());
        beerEntity.setType(ipaType);
        BeerEntity beerSaved = beerRepository.save(beerEntity);
        return beerMapper.toResponseBeerDTO(beerSaved);
    }
}
