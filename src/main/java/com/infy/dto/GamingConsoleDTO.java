package com.infy.dto;

public class GamingConsoleDTO {
	private Integer consoleId;
public Integer getConsoleId() {
		return consoleId;
	}
	public void setConsoleId(Integer consoleId) {
		this.consoleId = consoleId;
	}
private String brand;
private String mode;
private Double storage;
private String color;
private Double price;

public GamingConsoleDTO(Integer consoleId ,String brand, String mode, Double storage, String color, Double price) {
	super();
	this.consoleId = consoleId;
	this.brand = brand;
	this.mode = mode;
	this.storage = storage;
	this.color = color;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public Double getStorage() {
	return storage;
}
public void setStorage(Double storage) {
	this.storage = storage;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
