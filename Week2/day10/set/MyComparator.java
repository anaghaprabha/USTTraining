package com.learning.day10.set;

import java.util.*;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1); //Descending
		/*To print in the ascending order
		 return o1.compareTo(o2);  */
	}

}
