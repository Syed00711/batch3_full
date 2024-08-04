package com.microcare.spring.microcare_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.spring.microcare_spring_boot.entity.Regions;
import com.microcare.spring.microcare_spring_boot.model.Region;
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
	@GetMapping(path="/getregionswitha")
	public List<Regions> allRegionwitha() {
		return regionRepo.getRegionsWithA();
	}
	
	@PostMapping(path="/createregion")
	public Regions createRegion(@RequestBody Region region) {
		return regionsService.createRegion(region);
		
	}
	
	@PutMapping(path="/updateregion")
	public Regions updateRegion(@RequestBody Region region) {
		return regionsService.updateRegion(region);
	}
	
	@DeleteMapping(path="/deleteregion")
	public String deleteRegion(@RequestParam("id") long id) {
		 regionRepo.deleteById(id);
		 
		 return "Deleted Succesfully";
	}

}
