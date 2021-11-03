package com.zenika.tz.services.mapper;

import com.zenika.tz.repository.entity.BeerEntity;
import com.zenika.tz.services.dto.CreateBeerDTO;
import com.zenika.tz.services.dto.ResponseBeerDTO;

import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {


    ResponseBeerDTO toResponseBeerDTO(BeerEntity beer);

    BeerEntity toEntity(CreateBeerDTO createBeerDTO);

}
