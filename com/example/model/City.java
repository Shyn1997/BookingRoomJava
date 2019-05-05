package com.example.model;
// Generated Apr 30, 2019 11:52:28 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * City generated by hbm2java
 */
public class City implements java.io.Serializable {

	private int id;
	private String name;
	private Set districts = new HashSet(0);

	public City() {
	}

	public City(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public City(int id, String name, Set districts) {
		this.id = id;
		this.name = name;
		this.districts = districts;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getDistricts() {
		return this.districts;
	}

	public void setDistricts(Set districts) {
		this.districts = districts;
	}

}