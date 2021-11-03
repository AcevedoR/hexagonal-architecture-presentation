package com.zenika.tz.hexaarchi.dao;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.mapper.BeerEntityMapper;
import com.zenika.tz.hexaarchi.services.BeerRepositoryPort;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class BeerRepositoryAdapter implements BeerRepositoryPort {

    private final BeerRepository beerRepository;
    private final BeerEntityMapper beerEntityMapper = Mappers.getMapper(BeerEntityMapper.class);

    public BeerRepositoryAdapter(final BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public Beer save(final Beer b) {
        return beerEntityMapper.toBeer(beerRepository.save(beerEntityMapper.toEntity(b)));
    }
}
