package com.learning.day11;

import java.util.*;
import java.util.Map.Entry;


public class TreeMapEg {
public static void main(String[] args) {
	
	
	Map<String,String> hmss =new TreeMap<>();{
		hmss.put("Karnataka", "Bangalore");
		hmss.put("Kerala", "Trivandrum");
		hmss.put("Maharashtra", "Mumbai");
		
		Set<Entry<String,String>> sess= hmss.entrySet();
		Iterator<Entry<String,String>>iess=sess.iterator();

		System.out.println("Using While loop..........");
		//using while
		while(iess.hasNext()) {
			Entry<String,String> ess =iess.next();
			System.out.println(ess.getKey()+"-->"+ess.getValue());
		}
		
		//using enhanced for loop

		System.out.println("Using For loop..........");
		for(Entry<String,String> ess:sess) {
			System.out.println(ess.getKey()+"-->"+ess.getValue());
		}
	}
}
}
