package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;

public interface BeerService {

    ResponseBeerDTO create(CreateBeerDTO createBeerDTO);

}
