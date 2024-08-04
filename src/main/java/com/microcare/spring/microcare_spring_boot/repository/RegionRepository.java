package com.microcare.spring.microcare_spring_boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microcare.spring.microcare_spring_boot.entity.Regions;

public interface RegionRepository  extends JpaRepository<Regions,Long>{

	
	@Query(value="SELECT max(region_id) FROM Regions",nativeQuery=true)
	long getMaxId();
	
	@Query(value="SELECT * FROM Regions where region_name like 'A%'",nativeQuery=true)
	List<Regions> getRegionsWithA();
}
