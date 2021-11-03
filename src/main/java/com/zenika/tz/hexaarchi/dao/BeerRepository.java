package com.zenika.tz.hexaarchi.dao;

import com.zenika.tz.hexaarchi.entity.BeerEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<BeerEntity, Long> {
}
