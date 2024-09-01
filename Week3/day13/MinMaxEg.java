    package com.learning.day13;

import java.util.*;

import com.learning.day9.list.City;


public class MinMaxEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //Anonymous Inner Class
       
		
		//Lambda Expression - further refined
		    TreeSet<Country> treeset1 = new TreeSet<Country>(
				(c1,c2)-> (int) (c1.getGdp() - c2.getGdp()));
				    
		treeset1.add(new Country("India",3.4));
		treeset1.add(new Country("South Korea", 7.1));
		treeset1.add(new Country("Japan", 9.1));
		treeset1.add(new Country("China", 18 ));
		treeset1.add(new Country("United States", 25.5));
		
		
		Iterator <Country> itrc = treeset1.iterator();
		System.out.println("\nCountries in ascending order of GDP");
		while(itrc.hasNext()) {   
			  System.out.println(itrc.next().getName());
		}
    
		//Finding minimum , maximum element in treeset of countries in terms of GDP.
		Country cm = Collections.max(treeset1, (c1,c2) -> (int) (c1.getGdp()-c2.getGdp()));
		System.out.println("\nCountry with highest GDP: " +cm.getName());
		    
		Country cm2 = Collections.min(treeset1, (c1,c2) -> (int) (c1.getGdp()-c2.getGdp()));
		System.out.println("\nCountry with lowest GDP: " +cm2.getName());
		    
		//Finding minimum , maximum element in treeset of countries in sorting order of name.
		Country cm3 = Collections.max(treeset1, (c1,c2) -> (int) (c1.getName().compareTo(c2.getName())));
		System.out.println("\nCountry name in sort order descending max : " +cm3.getName());
		    
		Country cm4 = Collections.min(treeset1, (c1,c2) -> (int)(c1.getName().compareTo(c2.getName())));
		System.out.println("\nCountry name in sort order descending min : " +cm4.getName());
		    
	}

}
