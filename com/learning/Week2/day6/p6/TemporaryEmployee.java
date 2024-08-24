package com.learning.day6.p6;

import com.learning.day6.p5.Employee;

public class TemporaryEmployee extends Employee {

	private float hourly_pay;
	private String empl_address;

	public TemporaryEmployee(int eid, String name, float hourly_pay, String empl_address) {
		super(eid, name);
		this.hourly_pay = hourly_pay;
		this.empl_address = empl_address;

		// TODO Auto-generated constructor stub
	}

	public void displayt() {
		displaye();

		System.out.println("Hourly Salary: " + hourly_pay + "\nEmployer Address: " + empl_address);
		System.out.println("*************************");
	}

}
