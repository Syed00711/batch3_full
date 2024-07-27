package com.microcare.spring.microcare_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.spring.microcare_spring_boot.entity.Countries;
import com.microcare.spring.microcare_spring_boot.repository.CountryRepo;

@RestController
public class CountriesController {
	
	@Autowired
	CountryRepo cr;
	
	@GetMapping("/country/{id}")
     public Countries getCountry(@PathVariable("id")  char[] code) {
		return cr.findById(code).get();
	}
}
