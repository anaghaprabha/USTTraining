package com.learning.day13;

import java.util.*;
import java.util.Collections;

public class ListMain {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(42, 7, 908, 90, 87);
		System.out.println("Display1"  + list.toString());
		System.out.println("Getting min value " + Collections.min(list));
		System.out.println("Getting max value " + Collections.max(list));
		
		Collections.sort(list);
		
		System.out.println("Display2"  + list.toString());
	}

}