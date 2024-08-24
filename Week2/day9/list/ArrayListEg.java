package com.learning.day9.list;

import java.util.*;


public class ArrayListEg {
	public static void main(String[] args) {
		
		List<City> cities = new ArrayList<City>();
		cities.add(new City("Maharastra",100100,"Mumbai"));
		cities.add(new City("Kerala",689647,"Tvm"));
		cities.add(new City("Tamil Nadu",200010,"Chennai"));
		cities.add(new City("Tamil Nadu",200010,"Chennai")); //allows duplicate
		
		cities.add(2, new City("Andhra Pradesh",230010,"Hyderabad"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the state name: ");
		String state = scanner.next();
		System.out.println("Enter the pincode: ");
		long pcode = scanner.nextLong();
		System.out.println("Enter the capital city name: ");
		String city = scanner.next();

       cities.add(new City(state,pcode,city));

       Iterator<City> itr = cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}



	
	
}

