package com.microcare.spring.microcare_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microcare.spring.microcare_spring_boot.entity.Countries;

public interface CountryRepo extends JpaRepository<Countries,char[]>{

}
