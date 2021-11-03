package com.zenika.tz.hexaarchi.controller;

import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;
import com.zenika.tz.hexaarchi.mapper.BeerMapper;
import com.zenika.tz.hexaarchi.services.BeerService;

import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerAdapterController {

    private final BeerService beerServicePort;
    private final BeerMapper beerMapper = Mappers.getMapper(BeerMapper.class);

    public BeerAdapterController(final BeerService beerServicePort) {
        this.beerServicePort = beerServicePort;
    }

    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping
    public ResponseBeerDTO create(@RequestBody CreateBeerDTO createBeerDTO) {
        return beerMapper.toResponseBearDTO(beerServicePort.create(beerMapper.toCreateBeer(createBeerDTO)));
    }

}
