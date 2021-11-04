package com.zenika.tz.hexaarchi.dao;

import com.zenika.tz.hexaarchi.entity.BeerEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BeerRepository implements PanacheRepository<BeerEntity> {
}
