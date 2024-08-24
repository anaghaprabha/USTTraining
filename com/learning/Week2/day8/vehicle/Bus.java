package com.learning.day8.vehicle;

public class Bus extends Vehicle{

	private String name;
	private String purpose;
	
	public Bus(String name, String purpose) {
		super();
		this.name = name;
		this.purpose = purpose;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	@Override
	public String toString() {
		return "Bus [name = " + name + ", purpose = " + purpose + "]";
	}
	
}
