package com.microcare.spring.microcare_spring_boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")
public class Regions {
	
	@Id
	@Column(name="region_id")
	private long regionId;
	
	@Column(name="region_name")
	private String regionName;

	public long getRegionId() {
		return regionId;
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", regionName=" + regionName + "]";
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
