package com.example.model;
// Generated Apr 30, 2019 11:52:28 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set apartments = new HashSet(0);

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(String name, Set apartments) {
		this.name = name;
		this.apartments = apartments;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getApartments() {
		return this.apartments;
	}

	public void setApartments(Set apartments) {
		this.apartments = apartments;
	}

}