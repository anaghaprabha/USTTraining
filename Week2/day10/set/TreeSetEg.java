package com.learning.day10.set;

import java.util.*;


public class TreeSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeset = new TreeSet<>(new MyComparator());
		treeset.add("India");
		treeset.add("UK");
		treeset.add("USA");
		treeset.add("India");
		treeset.add("Bhutan");
		treeset.add("Zimbabwe");
		
		Iterator <String> itrs = treeset.iterator();
		System.out.println("Using while loop in Iterator");
		while(itrs.hasNext()) {   
			  System.out.println(itrs.next());
		}
		
		/* ALTERNATE USAGE
		 * System.out.println("\nUsing for loop in Iterator"); for(;itrs.hasNext();) {
		 * System.out.println(itrs.next()); }
		 * 
		 * System.out.println("\nUsing enhanced for loop"); for(String e : treeset) {
		 * System.out.print(e +"\t"); }
		 */
		
		TreeSet<Country> treeset1 = new TreeSet<Country>(new MyComparatorCountry());
		treeset1.add(new Country("India", 8.1));
		treeset1.add(new Country("South Korea", 7.1));
		treeset1.add(new Country("Japan", 9.1));
		Iterator <Country> itrc = treeset1.iterator();
		System.out.println("\nCountries in descending order of GDP");
		while(itrc.hasNext()) {   
			  System.out.println(itrc.next().getName());
		}
		
		
	}

}
