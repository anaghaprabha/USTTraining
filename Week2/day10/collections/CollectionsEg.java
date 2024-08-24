package com.learning.day10.collections;

import java.util.*;

import com.learning.day9.list.City;

public class CollectionsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<City> cities = new LinkedList<City>();
		cities.add(new City("Maharastra", 100100, "Mumbai"));
		cities.add(new City("Kerala", 689647, "Tvm"));
		cities.add(new City("Tamil Nadu", 200010, "Chennai"));
		cities.add(new City("Karnataka", 300010, "Bangalore"));

		display(cities, "Before reversing");

		Collections.reverse(cities);
		display(cities, "After reversing");

	}

	private static void display(List<City> city, String msg) {
		System.out.println(msg);

		Iterator<City> itr = city.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
