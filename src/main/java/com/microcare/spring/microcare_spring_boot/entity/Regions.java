package com.microcare.spring.microcare_spring_boot.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")
public class Regions {
	
	@Id
	@Column(name="region_id")
	private long regionId;
	
	@Column(name="region_name")
	private String regionName;
	
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="countryId",referencedColumnName="country_id")
	List<Countries> countries;

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}*/

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
