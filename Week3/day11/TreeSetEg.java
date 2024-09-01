package com.learning.day11;

import java.util.*;


public class TreeSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //Anonymous Inner Class
		/*
		 * Comparator<Country> cc = new Comparator<Country>() {
		 * 
		 * @Override public int compare(Country o1, Country o2) { // TODO Auto-generated
		 * method stub return (int) (o1.getGdp() - o2.getGdp()); }
		 */
    	 
       
		
		//Lambda Expression



		TreeSet<Country> treeset1 = new TreeSet<Country>(
				(c1,c2)->{
					return (int) (c1.getGdp() - c2.getGdp());
							});
				
		treeset1.add(new Country("India", 8.1));
		treeset1.add(new Country("South Korea", 7.1));
		treeset1.add(new Country("Japan", 9.1));
		Iterator <Country> itrc = treeset1.iterator();
		System.out.println("\nCountries in ascending order of GDP");
		while(itrc.hasNext()) {   
			  System.out.println(itrc.next().getName());
		}



		
		
	}

}
