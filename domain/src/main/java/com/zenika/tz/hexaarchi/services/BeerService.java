package com.zenika.tz.hexaarchi.services;


import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.domain.CreateBeer;

public interface BeerService {

    Beer create(CreateBeer createBeerDTO);

}
