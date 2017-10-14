package com.boot.GoPlaces.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//The Bean Class in Domain package
@Entity
public class Place {
	@Id
	private String id;
	private String name;
	private String location;
	private String url;
	
	// No-arg Constructor 
	public Place() {
		
	}
	
	// Parameterised Constructor
	public Place(String id, String name, String location, String url) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.url = url;
	}
	//Setters and Getters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
