package com.rjxy.bean;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class District implements Serializable {
	private Integer id;
	private String name;

	private Set<Street> streets = new HashSet<Street>();
	public District(){
		
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

	@SuppressWarnings("unchecked")
	public Set getStreets() {
		return streets;
	}

	@SuppressWarnings("unchecked")
	public void setStreets(Set streets) {
		this.streets = streets;
	}
	
}
