package com.learning.day16;

import java.util.*;
import java.util.Map.Entry;
//Linked HashMap maintains insertion order and doesn't allow duplicates
public class LinkedHMapEg {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> hmap = new LinkedHashMap<>();
		hmap.put("key1","value1");
		hmap.put("key3","value2");
		hmap.put("key2","value4");
		hmap.put("key4","value3");
		hmap.put("key1","value1");
		hmap.put("key5","value5");
	
		Set<Entry<String, String>> entryset = hmap.entrySet();

		for(Entry<String, String> ess: entryset){
			System.out.println(ess.getKey()+"-->"+ess.getValue());
			}

		
		
	}

}
