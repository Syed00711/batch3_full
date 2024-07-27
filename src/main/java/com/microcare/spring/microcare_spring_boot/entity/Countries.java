package com.microcare.spring.microcare_spring_boot.entity;

import javax.swing.plaf.synth.Region;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class Countries {

	@Id
	@Column(name="country_id")
	private char[] countryId;
	
	@Column(name="country_name")
	private String countryName;
	
	
	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="regionId",referencedColumnName="region_id")
	Regions region;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public char[] getCountryId() {
		return countryId;
	}

	public void setCountryId(char[] countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	
	
	
	
}
