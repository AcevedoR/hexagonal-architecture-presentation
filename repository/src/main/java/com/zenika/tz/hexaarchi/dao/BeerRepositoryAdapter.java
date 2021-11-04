package com.zenika.tz.hexaarchi.dao;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.mapper.BeerEntityMapper;
import com.zenika.tz.hexaarchi.services.BeerRepositoryPort;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class BeerRepositoryAdapter implements BeerRepositoryPort {

    private final BeerRepository beerRepository;
    private final BeerEntityMapper beerEntityMapper = Mappers.getMapper(BeerEntityMapper.class);

    @Inject
    public BeerRepositoryAdapter(final BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    @Transactional
    public Beer save(final Beer b) {
        beerRepository.persist(beerEntityMapper.toEntity(b));
        return beerEntityMapper.toBeer(
                beerRepository.find("name", Sort.descending("id"), b.name())// shhhhhuut, just look away
                        .stream().findFirst().orElseThrow()
        );
    }
}
