package com.learning.day4;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		EmployeeManager empMgr = new EmployeeManager();
		Employee emp1 = new Employee(100,"Sachin", 12, "Sr. Developer");
		Employee emp2 = new Employee(101,"Ramesh", 3, "Jr. Developer");
		empMgr.addEmployee(emp1);
		empMgr.addEmployee(emp2);
        empMgr.listEmployees();
        empMgr.deleteEmployee();
        System.out.println("After deleting employees: -");
        empMgr.listEmployees();
	}
	
	
}


class Employee{
	int empID;
	String name;
	int exp;
	String jobTitle;

	
	Employee(){
		empID = 0;
		name = "";
		exp = 0;
		jobTitle = "";
	}

	public Employee(int empID, String name, int exp, String jobTitle) {
		this.empID = empID;
		this.name = name;
		this.exp = exp;
		this.jobTitle = jobTitle;
	}

	
	
	
	public void displayEmployees() {
		System.out.println(empID + "\t | " + name + "\t\t | " + exp+ "\t\t | " + jobTitle);
		
	}
	
}

class EmployeeManager{
	
	Employee emp [];
	int eindex;
	
	public EmployeeManager() {
		
		emp = new Employee[5];
		eindex = 0;
	}
	
	Employee addEmployee(Employee employee) {
		emp[eindex] = employee;
		eindex++;
		return employee;

	}
	
	void deleteEmployee() {
		emp = new Employee[5];
		eindex = 0;

	}

	
	public void listEmployees() {
		
		System.out.println("ID \t | Name \t\t | Experience \t | Job Title");
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < eindex; i++) {

			emp[i].displayEmployees();
		}
		System.out.println("---------------------------------------------------------");
	
}
}

