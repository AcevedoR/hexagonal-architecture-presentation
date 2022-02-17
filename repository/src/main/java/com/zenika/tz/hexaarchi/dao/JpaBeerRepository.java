package com.zenika.tz.hexaarchi.dao;

import com.zenika.tz.hexaarchi.domain.Beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBeerRepository extends JpaRepository<Beer, Long> {
}
