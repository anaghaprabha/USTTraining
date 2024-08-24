package com.learning.day10.set;

import java.util.*;

public class MyComparatorCountry implements Comparator<Country>{

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getGdp() - o1.getGdp());
	}


}
