package com.zenika.tz.hexaarchi;


import com.zenika.tz.hexaarchi.services.BeerRepositoryPort;
import com.zenika.tz.hexaarchi.services.BeerService;
import com.zenika.tz.hexaarchi.services.BeerServiceImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.ws.rs.Produces;

@Dependent
public class BeerServiceBeanProducer {

    @Produces
    @ApplicationScoped
    public BeerService beerService(final BeerRepositoryPort beerRepositoryPort) {
        return new BeerServiceImpl(beerRepositoryPort);
    }
}
