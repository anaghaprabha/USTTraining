package com.learning.day6.p5;

public class PermanentEmployee extends Employee {

	private float salary;

	private String addr;

	public PermanentEmployee(int empid, String name, float salary, String addr) {
		super(empid, name); // calls base class default constructor

		this.salary = salary;

		this.addr = addr;

	}

	public float getSalary() {

		return salary;

	}

	public void setSalary(float salary) {

		this.salary = salary;

	}

	public String getAddr() {

		return addr;

	}

	public void setAddr(String addr) {

		this.addr = addr;

	}

	public void displayp() {

		displaye();

		System.out.println("Salary: " + salary + "\nAddress: " + addr);
		System.out.println("*************************");
	}

}
