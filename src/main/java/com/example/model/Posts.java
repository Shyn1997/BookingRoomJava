package com.example.model;
// Generated May 1, 2019 10:15:11 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Posts generated by hbm2java
 */
@Entity
@Table(name = "posts", catalog = "bookingroom")
public class Posts implements java.io.Serializable {

	private Integer id;
	private Address address;
	private Apartment apartment;
	private User user;
	private String titile;
	private String content;
	private String img;
	private String startAt;
	private int status;
	private double price;

	public Posts() {
	}

	public Posts(Integer id,Address address, Apartment apartment, User user, String titile, String content, String img,
			String startAt, int status, double price) {
		this.id=id;
		this.address = address;
		this.apartment = apartment;
		this.user = user;
		this.titile = titile;
		this.content = content;
		this.img = img;
		this.startAt = startAt;
		this.status = status;
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address", nullable = false)
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "apartment", nullable = false)
	public Apartment getApartment() {
		return this.apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "titile", nullable = false, length = 100)
	public String getTitile() {
		return this.titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	@Column(name = "content", nullable = false, length = 100)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "img", nullable = false, length = 1000)
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "start_at", nullable = false, length = 50)
	public String getStartAt() {
		return this.startAt;
	}

	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}