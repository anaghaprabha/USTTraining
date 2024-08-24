package com.learning.day5.p2;

import com.learning.day5.p1.Product;

public class ShoppingCart {

	// data members
	private Product aprod[];
	int cindex;

	public ShoppingCart() {
		aprod = new Product[5];
		cindex = 0;

	}

	public Product addProducts(Product prod) {
		aprod[cindex] = prod;
		cindex++;
		System.out.println("\nAdded Products with id: " + prod.getId() + "\n");
		return prod;

	}

	public void listProducts() {
		for (int i = 0; i < cindex; i++) {

			aprod[i].display();

		}
	}

}
