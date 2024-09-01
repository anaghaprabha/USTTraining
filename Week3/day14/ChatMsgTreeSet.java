package com.learning.day14;

import java.util.*;

public class ChatMsgTreeSet {

	public static void main(String[] args) {

		TreeSet<String> tmsg = new TreeSet<>(new RComparator());
		tmsg.add("P1 - In Progress");
		tmsg.add("P2 - error");
		tmsg.add("P3 - Done");
		tmsg.add("P4 - Done");
		tmsg.add("P5 - In Progress");
		tmsg.add("P6 - completed");
		tmsg.add("P7 - Welcome");
		tmsg.add("P6 - done");
		tmsg.add("P5 - COMPLETED");
		display(tmsg);

		Iterator<String> itrc = tmsg.iterator();
		System.out.println("\nMessages in descending order");
		while (itrc.hasNext()) {
			System.out.println(itrc.next());
		}

	}

	static void display(TreeSet<String> tmsgs) {
		for (String str : tmsgs) {
			System.out.print(str + " | ");
		}
	}

}

//Implement Comparator interface as class
class RComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		return s2.compareTo(s1);
	}

}
