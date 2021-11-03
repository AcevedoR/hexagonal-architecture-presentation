package com.zenika.tz.services.services;

import com.zenika.tz.services.dto.CreateBeerDTO;
import com.zenika.tz.services.dto.ResponseBeerDTO;

public interface BeerService {

    ResponseBeerDTO create(CreateBeerDTO createBeerDTO);

}
