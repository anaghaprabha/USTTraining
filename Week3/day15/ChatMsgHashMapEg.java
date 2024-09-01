package com.learning.day15;

import java.util.*;

public class ChatMsgHashMapEg {

	public static void main(String[] args) {
		
		HashMap<String, String> hmss = new HashMap<>();
		hmss.put("name1", "msg1");
		hmss.put("name2", "msg2");
		hmss.put("name3", "msg3");
		hmss.put("name4", "msg4");
		hmss.put("name5", "msg5");
		
	   Set<String> keyset = hmss.keySet();
	   for(String key : keyset) {
		   System.out.println(key+" - "+hmss.get(key));
	   }
		

	}

}
