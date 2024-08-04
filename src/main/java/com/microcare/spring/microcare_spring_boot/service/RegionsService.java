package com.microcare.spring.microcare_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microcare.spring.microcare_spring_boot.entity.Regions;
import com.microcare.spring.microcare_spring_boot.model.Region;
import com.microcare.spring.microcare_spring_boot.repository.RegionRepository;
import com.microcare.spring.microcare_spring_boot.util.Constants;

/**
 * @author sh030348
 * {@summary} this class is for business logic for your region table 
 */

@Service
public class RegionsService {
	
	@Autowired
	 private RegionRepository regionRepo;
	/*
	 * 
	 * 
	 */
	public Regions getRegions(long regionId) {
		return regionRepo.findById(regionId).get();
	}
	
	public Regions createRegion(Region region) {
		Regions regions =new Regions();
		
		regions.setRegionId(regionRepo.getMaxId()+1);
		regions.setRegionName(region.getRegionName());
		
		return regionRepo.save(regions); 
	}
	
	public Regions updateRegion(Region region) {
		Regions regions =new Regions();
		
		regions.setRegionId(region.getRegionId());
		regions.setRegionName(Constants.BANK);
		
		return regionRepo.save(regions); 
	}

}
