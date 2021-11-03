package com.zenika.tz.hexaarchi.mapper;

import com.zenika.tz.hexaarchi.entity.BeerEntity;
import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;

import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {


    ResponseBeerDTO toResponseBeerDTO(BeerEntity beer);

    BeerEntity toEntity(CreateBeerDTO createBeerDTO);

}
