package com.learning.day8.composition;

import java.util.Arrays;

public class University {
	private String name;
	private String address;
	private Department depts[];

	public University(String name, String address, Department[] depts) {
		super();
		this.name = name;
		this.address = address;
		this.depts = depts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department[] getDepts() {
		return depts;
	}

	public void setDepts(Department[] depts) {
		this.depts = depts;
	}

	@Override
	public String toString() {

		return "University [name=" + name + ", address=" + address + ", \ndepts=" + Arrays.toString(depts) + "]\n";
	}



}
