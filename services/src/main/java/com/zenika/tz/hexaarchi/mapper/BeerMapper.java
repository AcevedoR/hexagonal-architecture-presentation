package com.zenika.tz.hexaarchi.mapper;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;

import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {


    ResponseBeerDTO toResponseBeerDTO(Beer beer);

    Beer toBeer(CreateBeerDTO createBeerDTO);

}
