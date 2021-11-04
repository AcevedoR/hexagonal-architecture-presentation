package com.zenika.tz.hexaarchi;


import com.zenika.tz.hexaarchi.services.BeerRepositoryPort;
import com.zenika.tz.hexaarchi.services.BeerService;
import com.zenika.tz.hexaarchi.services.BeerServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeerServiceBeanProducer {

    @Bean
    public BeerService beerService(final BeerRepositoryPort beerRepositoryPort) {
        return new BeerServiceImpl(beerRepositoryPort);
    }
}
