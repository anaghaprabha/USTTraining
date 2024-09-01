package com.learning.day15;

import java.util.*;

public class ChatMsgTreeMapEg {

	public static void main(String[] args) {

		TreeMap<String, String> tmap = new TreeMap<>();
		tmap.put("name1", "msg1");
		tmap.put("name2", "msg2");
		tmap.put("name3", "msg3");
		tmap.put("name4", "msg4");
		tmap.put("name5", "msg5");
		System.out.println("--Printing the original treemap--");
		display(tmap);
		System.out.println("------------------------------------");

		/*
		 * #2. Create TreeMap to store ChatMessages, both Key and Value are String Type.
		 * Store in descending order of names?
		 */

		// Using comparator lambda expression
		TreeMap<String, String> tlmap = new TreeMap<>((key1, key2) -> key2.compareTo(key1));
		tlmap.put("name1", "msg1");
		tlmap.put("name2", "msg2");
		tlmap.put("name3", "msg3");
		tlmap.put("name4", "msg4");
		tlmap.put("name5", "msg5");
		System.out.println("-- Printing the reversed treemap using lambda expression --");
		display(tlmap);
		System.out.println("------------------------------------");

		// Using Collections class reverseOrder method
		TreeMap<String, String> trmap = new TreeMap<>(Collections.reverseOrder());
		trmap.put("name1", "msg1");
		trmap.put("name2", "msg2");
		trmap.put("name3", "msg3");
		trmap.put("name4", "msg4");
		trmap.put("name5", "msg5");
		System.out.println("-- Printing the reversed treemap using Collections reverse Order method --");
		display(trmap);
		System.out.println("------------------------------------");
	}

	static void display(TreeMap<String, String> treemap) {
		Set<String> keyset = treemap.keySet();
		for (String key : keyset) {
			System.out.println(key + " - " + treemap.get(key));
		}
	}

}
