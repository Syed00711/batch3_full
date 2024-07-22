package com.microcare.spring.microcare_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microcare.spring.microcare_spring_boot.entity.Regions;

public interface RegionRepository  extends JpaRepository<Regions,Long>{

}
