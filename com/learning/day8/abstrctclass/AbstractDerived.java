package com.learning.day8.abstrctclass;

public class AbstractDerived extends AbstractBase {

	private int derid;
	private String dname;
	
	public AbstractDerived(int derid, String dname, int id, String name) {
		super();
		this.derid = derid;
		this.dname = dname;
		this.id = id;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "AbstractDerived [derid=" + derid + ", dname=" + dname + ", \nid=" + id + ", name=" + name + "]";
	}
	
	
	
}
