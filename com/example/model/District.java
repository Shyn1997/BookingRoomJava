package com.example.model;
// Generated Apr 30, 2019 11:52:28 AM by Hibernate Tools 5.2.12.Final

/**
 * District generated by hbm2java
 */
public class District implements java.io.Serializable {

	private int id;
	private City city;
	private String name;

	public District() {
	}

	public District(int id, City city, String name) {
		this.id = id;
		this.city = city;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
