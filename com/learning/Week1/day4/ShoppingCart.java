package com.learning.day4;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		Products p1 = new Products(112, "Computer", 10000);
		Products p2 = new Products(113, "Clothing", 1000);
		cart.addProducts(p1);
		cart.addProducts(p2);
		cart.listProducts();
		System.out.println("\nTotal price on checkout: " + cart.checkOut());
		cart.emptyCart();
		System.out.println("Total price after emptying cart: " + cart.checkOut());

	}
}

class Products {
	int id;
	String name;
	int price;

	Products() {
		id = 0;
		name = "";
		price = 100;
		// num_of_products = 100;

	}

	Products(int pid, String pname, int pprice) {
		id = pid;
		name = pname;
		price = pprice;
	}

	void display() {
		
		System.out.println(id + "\t | " + name + "\t\t | " + price);
	}
}

class Cart {

	// data members
	Products aprod[];
	int cindex;

	Cart() {
		aprod = new Products[5];
		cindex = 0;

	}

	Products addProducts(Products prod) {
		aprod[cindex] = prod;
		cindex++;
		System.out.println("\nAdded Products with id: " + prod.id);
		return prod;

	}

	void listProducts() {
		System.out.println("-------------- My Cart ---------------");
		System.out.println("----------------------------------------");
		System.out.println("id \t | name \t\t | price");
		System.out.println("----------------------------------------");
		for (int i = 0; i < cindex; i++) {

			aprod[i].display();
		}
		System.out.println("----------------------------------------");
	}

	int checkOut() {
		int sum = 0;
		for (int i = 0; i < cindex; i++) {

			sum = sum + aprod[i].price;
		}
		return sum;
	}

	void emptyCart() {

		aprod = new Products[5];
		cindex = 0;

	}
}
