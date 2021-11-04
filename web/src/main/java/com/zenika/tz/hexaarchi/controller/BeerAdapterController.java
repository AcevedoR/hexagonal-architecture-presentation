package com.zenika.tz.hexaarchi.controller;

import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;
import com.zenika.tz.hexaarchi.mapper.BeerMapper;
import com.zenika.tz.hexaarchi.services.BeerService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mapstruct.factory.Mappers;

@Path("/")
public class BeerAdapterController {

    private final BeerService beerServicePort;
    private final BeerMapper beerMapper = Mappers.getMapper(BeerMapper.class);

    @Inject
    public BeerAdapterController(final BeerService beerServicePort) {
        this.beerServicePort = beerServicePort;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseBeerDTO create(CreateBeerDTO createBeerDTO) {
        return beerMapper.toResponseBearDTO(beerServicePort.create(beerMapper.toCreateBeer(createBeerDTO)));
    }
}
