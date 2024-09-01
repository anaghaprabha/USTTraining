package com.learning.day13;

public class Country {

	private String name;
	private double gdp;
	public Country(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGdp() {
		return gdp;
	}
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}
	
	
	
}
