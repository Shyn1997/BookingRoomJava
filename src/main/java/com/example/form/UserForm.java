package com.example.form;

public class UserForm {
	private String name;
	private String id_number;
	private String phone;
	private String avt;
	private String email;
	private String address;
	public UserForm() {
		super();
	}
	public UserForm(String name, String id_number, String phone, String avt, String email, String address) {
		super();
		this.name = name;
		this.id_number = id_number;
		this.phone = phone;
		this.avt = avt;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAvt() {
		return avt;
	}
	public void setAvt(String avt) {
		this.avt = avt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
