package com.learning.day8.composition;

public class Department{
	private int id;
	private String deptname;
	private String hodname;
	
	
	public Department(int id, String deptname, String hodname) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.hodname = hodname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getHodname() {
		return hodname;
	}
	public void setHodname(String hodname) {
		this.hodname = hodname;
	}

	@Override
	public String toString() {
		return "\n\n Department [id=" + id + ", deptname=" + deptname + ", hodname=" + hodname + "]";
	}
	
	
	
}
