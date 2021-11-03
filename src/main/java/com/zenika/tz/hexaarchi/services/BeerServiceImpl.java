package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.dao.BeerRepository;
import com.zenika.tz.hexaarchi.entity.BeerEntity;
import com.zenika.tz.hexaarchi.mapper.BeerMapper;
import com.zenika.tz.hexaarchi.pojo.CreateBeerDTO;
import com.zenika.tz.hexaarchi.pojo.ResponseBeerDTO;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;

    private final BeerMapper beerMapper = Mappers.getMapper(BeerMapper.class);

    public BeerServiceImpl(final BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public ResponseBeerDTO create(final CreateBeerDTO createBeerDTO) {

        BeerEntity beerEntity = beerMapper.toEntity(createBeerDTO);
        BeerEntity beerSaved = beerRepository.save(beerEntity);

        return beerMapper.toResponseBeerDTO(beerSaved);
    }
}
