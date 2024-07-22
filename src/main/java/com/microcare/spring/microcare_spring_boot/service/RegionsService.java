package com.microcare.spring.microcare_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microcare.spring.microcare_spring_boot.entity.Regions;
import com.microcare.spring.microcare_spring_boot.repository.RegionRepository;

@Service
public class RegionsService {
	
	@Autowired
	 private RegionRepository regionRepo;
	
	public Regions getRegions(long regionId) {
		return regionRepo.findById(regionId).get();
	}

}
