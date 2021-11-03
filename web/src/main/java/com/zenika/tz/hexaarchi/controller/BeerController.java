package com.zenika.tz.hexaarchi.controller;

import com.zenika.tz.services.dto.CreateBeerDTO;
import com.zenika.tz.services.dto.ResponseBeerDTO;
import com.zenika.tz.services.services.BeerService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerController {

    private BeerService beerService;

    public BeerController(final BeerService beerService) {
        this.beerService = beerService;
    }

    @ResponseStatus (HttpStatus.CREATED)
    @PostMapping
    public ResponseBeerDTO create(@RequestBody CreateBeerDTO createBeerDTO) {
        return beerService.create(createBeerDTO);
    }

}
