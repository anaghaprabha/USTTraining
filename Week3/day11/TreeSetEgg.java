    package com.learning.day11;

import java.util.*;

import com.learning.day9.list.City;


public class TreeSetEgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //Anonymous Inner Class
       
		
		//Lambda Expression - further refined
		    TreeSet<Country> treeset1 = new TreeSet<Country>(
				(c1,c2)-> (int) (c1.getGdp() - c2.getGdp()));
				    
		treeset1.add(new Country("India", 8.1));
		treeset1.add(new Country("South Korea", 7.1));
		treeset1.add(new Country("Japan", 9.1));
		Iterator <Country> itrc = treeset1.iterator();
		System.out.println("\nCountries in ascending order of GDP");
		while(itrc.hasNext()) {   
			  System.out.println(itrc.next().getName());
		}
    
		Country cm = Collections.max(treeset1, (c1,c2) -> (int) (c1.getGdp()-c2.getGdp()));
		System.out.println("\nCountry with highest GDP: " +cm.getName());
		    
		Country cm2 = Collections.min(treeset1, (c1,c2) -> (int) (c1.getGdp()-c2.getGdp()));
		System.out.println("\nCountry with lowest GDP: " +cm2.getName());
		    
		
	}

}
