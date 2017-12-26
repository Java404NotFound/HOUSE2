package com.rjxy.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Type implements Serializable {
	
	private Integer id;
	private String name;

	private Set<House> houses = new HashSet<House>();
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
	
	@SuppressWarnings("unchecked")
	public Set getHouses() {
		return houses;
	}

	@SuppressWarnings("unchecked")
	public void setHouses(Set houses) {
		this.houses = houses;
	}

}
