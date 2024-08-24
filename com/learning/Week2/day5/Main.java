package com.learning.day5;

import com.learning.day5.p1.Product;
import com.learning.day5.p2.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nNumber of Products: " + Product.getNumberOfProducts() + "\n");

		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product(112, "Computer");
		cart.addProducts(p1);
		System.out.println("id \t| name \t\t| num of products");
		System.out.println("---------------------------------------------");
		cart.listProducts();
		Product p2 = new Product(113, "Clothing");
		cart.addProducts(p2);
		System.out.println("id \t| name \t\t| num of products");
		System.out.println("---------------------------------------------");
		
		cart.listProducts();
	}
}
