package com.learning.day5.p1;

public class Product {
	int id;
	String name;
	static int num_of_products = 100;

	Product() {
		id = 0;
		name = "";
		// num_of_products = 100;
	}

	public Product(int pid, String pname) {
		this();
		id = pid;
		name = pname;
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

	public static int getNum_of_products() {
		return num_of_products;
	}

	public static void setNum_of_products(int num_of_products) {
		Product.num_of_products = num_of_products;
	}

	public static int getNumberOfProducts() {

		return num_of_products;

	}

	public Product display() {
		int num = getNumberOfProducts();
		System.out.println(id + " \t| " + name + " \t| " + num);
		return this;
	}
}
