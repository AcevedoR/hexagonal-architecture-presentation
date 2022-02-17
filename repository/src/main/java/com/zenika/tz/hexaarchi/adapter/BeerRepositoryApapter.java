package com.zenika.tz.hexaarchi.adapter;

import com.zenika.tz.hexaarchi.dao.JpaBeerRepository;
import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.spi.IBeerRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeerRepositoryApapter implements IBeerRepositoryPort {
    @Autowired
    private JpaBeerRepository beerRepository;

    @Override
    public Beer save(final Beer b) {
        return beerRepository.save(b);
    }
}
