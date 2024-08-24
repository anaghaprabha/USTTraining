package com.learning.day7;

public class ProductEg {
	public static void main(String[] args) {

		Product obj1 = new ElectronicProduct(12,"Television", 50.12f);
		// method overriding or dynamic polymorphism (runtime decision)
		obj1.display(); // display of derived
		
		
		System.out.println("Product Object is " + obj1.toString());
		
		Product obj2 = new Product(13,"Testing");
		obj2.display(); // display of base class
		
		Product obj3 = new Product(12,"Testing1");
		Product obj4 = new Product(22,"Testing123");
		
		
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
		System.out.println(obj2.equals(obj4));
		
		
	}
}

class Product {

	private int id;
	private String name;

	public Product() {

	}

	public boolean equals(Product prod) {
		// TODO Auto-generated method stub
		boolean equal = false;
        if(this.getId()==prod.getId()) {
        	equal = true;
        }
		return equal;
		

	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;

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

	public void display() {
		System.out.println("Product.display()");
	}

	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
	
	/*
	 * public final void notify() {
	 * 
	 * }
	 */
}

//Inheritance is Is-A-Relationship
class ElectronicProduct extends Product {
	
	public ElectronicProduct()
	{
		
	}
	private float voltage;
	
	public ElectronicProduct(int id, String name, float voltage) {
		
		super(id, name);
		voltage = this.voltage;

	}

	

	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public void display() {
		System.out.println("ElectronicProduct.display()");
	}



	@Override
	public String toString() {
		return "ElectronicProduct [voltage =" + voltage + ", id =" + getId() + ", name =" + getName() + "]";
	}
	
	


}