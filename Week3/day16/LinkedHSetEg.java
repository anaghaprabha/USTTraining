
package com.learning.day16;

import java.util.*;
//Linked HashSet maintains insertion order and doesn't allow duplicates
public class LinkedHSetEg {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hset = new LinkedHashSet<>();
		hset.add("hello");
		hset.add("good morning");
		hset.add("very good morning");
		hset.add("hi");
		hset.add("thanks");
		hset.add("welcome");
		hset.add("thank you");
		hset.add("welcome");
		
		hset.stream().forEach((item) -> {System.out.println(item);});
		

		
	}

}
