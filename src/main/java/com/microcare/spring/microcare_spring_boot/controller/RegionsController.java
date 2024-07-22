package com.microcare.spring.microcare_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.spring.microcare_spring_boot.entity.Regions;
import com.microcare.spring.microcare_spring_boot.repository.RegionRepository;
import com.microcare.spring.microcare_spring_boot.service.RegionsService;

@RestController
public class RegionsController {
	
	@Autowired
	RegionsService regionsService;
	
	@Autowired
	RegionRepository regionRepo;
	
	@GetMapping(path="/getregion")
	public Regions fetchRegion(@RequestParam("id") long id) {
		return regionsService.getRegions(id);
	}
	
	@GetMapping(path="/getregions")
	public List<Regions> allRegion() {
		return regionRepo.findAll();
	}

}
