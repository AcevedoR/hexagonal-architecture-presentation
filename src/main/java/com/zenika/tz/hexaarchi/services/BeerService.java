package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.pojo.CreateBeerDTO;
import com.zenika.tz.hexaarchi.pojo.ResponseBeerDTO;

public interface BeerService {

    ResponseBeerDTO create(CreateBeerDTO createBeerDTO);

}
