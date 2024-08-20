package com.learning.day6.p5;

public class Employee {

	private int eid;

	private String name;

	protected Employee() {
		System.out.println("Employee");
	}

	protected Employee(int eid, String name) {

		this.eid = eid;

		this.name = name;

	}

	public int getEid() {

		return eid;

	}

	public void setEid(int eid) {

		this.eid = eid;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void displaye() {

		System.out.println("Employee id:" + eid + "\nname:" + name);

	}

}
