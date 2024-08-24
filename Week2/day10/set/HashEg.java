
package com.learning.day10.set;

import java.util.HashSet;

public class HashEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		HashSet<String> hss = new HashSet<>();
		
		hss.add("India");
		hss.add("UK");
		hss.add("USA");
		hss.add("India");
		hss.add("Bhutan");
		
		for(String element : hss) {
			System.out.print(element+"\t"); 
		}
		
		hss.remove("Bhutan");
		System.out.println("\nAfter removing: ");
		for(String element : hss) {
			System.out.print(element+"\t"); 
		}
		
		hss.removeAll(hss);
		System.out.println("\nAfter removing all: ");
		for(String element : hss) {
			System.out.print(element+"\t"); 
		}
		
		HashSet<City> hsc = new HashSet<>();
		
		//add city objects to list
		System.out.println("\nAdding City Objects to the list: ");
		hsc.add(new City("Maharastra",100100,"Mumbai"));
		hsc.add(new City("Kerala",689647,"Tvm"));
		hsc.add(new City("Tamil Nadu",200010,"Chennai"));
		hsc.add(new City("Tamil Nadu",200010,"Chennai")); 
		
		for(City element : hsc) {
			System.out.print(element+"\n"); 
		}
	}

}
