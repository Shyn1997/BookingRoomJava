package com.example.formBean;

public class EditForm {
	private String title;
	private String content;
	private String start_at;
	private String status;
	private String image;
	private double price;
	public EditForm() {
		super();
	}
	public EditForm(String title, String content, String start_at, String status, String image, double price) {
		super();
		this.title = title;
		this.content = content;
		this.start_at = start_at;
		this.status = status;
		this.image = image;
		this.price = price;
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
	public String getStart_at() {
		return start_at;
	}
	public void setStart_at(String start_at) {
		this.start_at = start_at;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
