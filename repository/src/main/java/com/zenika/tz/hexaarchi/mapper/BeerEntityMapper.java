package com.zenika.tz.hexaarchi.mapper;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.entity.BeerEntity;

import org.mapstruct.Mapper;

@Mapper
public interface BeerEntityMapper {

    BeerEntity toEntity(Beer beer);

    Beer toBeer(BeerEntity beerEntity);
}
