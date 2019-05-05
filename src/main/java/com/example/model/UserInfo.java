package com.example.model;

public class UserInfo {

	private Long id;
	private String name;
	private Long id_number;
	private Long type;
	private Long phone;
	private String avt;
	private String start_at;
	private String email;
	private Long address;
	public UserInfo() {
		super();
	}
	public UserInfo(Long id, String name, Long id_number, Long type, Long phone, String avt, String start_at,
			String email, long address) {
		super();
		this.id = id;
		this.name = name;
		this.id_number = id_number;
		this.type = type;
		this.phone = phone;
		this.avt = avt;
		this.start_at = start_at;
		this.email = email;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId_number() {
		return id_number;
	}
	public void setId_number(Long id_number) {
		this.id_number = id_number;
	}
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAvt() {
		return avt;
	}
	public void setAvt(String avt) {
		this.avt = avt;
	}
	public String getStart_at() {
		return start_at;
	}
	public void setStart_at(String start_at) {
		this.start_at = start_at;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAddress() {
		return address;
	}
	public void setAddress(Long address) {
		this.address = address;
	}
	
}
