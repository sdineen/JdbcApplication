package com.qa.jdbc;

public class Product {
	private int id;
	private String name;
	private double costPrice;
	private double retailPrice;
	
	public Product(int id, String name, double costPrice, double retailPrice) {
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.retailPrice = retailPrice;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
}
