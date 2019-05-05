package com.example.model;

public class PostInfo {
	private Long id;
	private String title;
	private String content;
	private String img;
	private String startAt;
	private Long status;
	private Double price;
	private String address;
	private String user;
	private String apartment;
//	private Long addressId;
//	private String city;
//	private Long userId;
//	private String name;
//	private Long apartmentId;
//	private String type;
	public PostInfo() {
		super();
	}
	public PostInfo(Long id, String title, String content, String img, String startAt, Long status, Double price,
			String address, String user, String apartment/*, Long addressId, String city, Long userId, String name,
			Long apartmentId, String type*/) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.img = img;
		this.startAt = startAt;
		this.status = status;
		this.price = price;
		this.address = address;
		this.user = user;
		this.apartment = apartment;
//		this.addressId = addressId;
//		this.city = city;
//		this.userId = userId;
//		this.name = name;
//		this.apartmentId = apartmentId;
//		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
//	public Long getAddressId() {
//		return addressId;
//	}
//	public void setAddressId(Long addressId) {
//		this.addressId = addressId;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Long getApartmentId() {
//		return apartmentId;
//	}
//	public void setApartmentId(Long apartmentId) {
//		this.apartmentId = apartmentId;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	
}
