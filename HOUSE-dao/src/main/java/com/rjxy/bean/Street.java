package com.rjxy.bean;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Street implements Serializable {
	private Integer id;
    private String name; 
    private District district;

	private Set<House> houses = new HashSet<House>();
    public Street(){
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

/*	public Integer getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Integer districtId) {
		district_id = districtId;
	}*/

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@SuppressWarnings("unchecked")
	public Set getHouses() {
		return houses;
	}
	
	@SuppressWarnings("unchecked")
	public void setHouses(Set houses) {
		this.houses = houses;
	}
	
}
