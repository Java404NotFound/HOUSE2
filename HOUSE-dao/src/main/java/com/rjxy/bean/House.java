package com.rjxy.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class House implements Serializable {
	private Integer id;
	private User user;
	private Street street;
	private Type type;
	private String title;
	private String description;
	private Date bugdate;
	private String price;
	private String contact;
	private String image;
	private String floorage;
	private Set<Picture> pictures = new HashSet<Picture>();

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getBugdate() {
		return bugdate;
	}

	public void setBugdate(Date bugdate) {
		this.bugdate = bugdate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getFloorage() {
		return floorage;
	}

	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}
}