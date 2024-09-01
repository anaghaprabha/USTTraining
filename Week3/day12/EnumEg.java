package com.learning.day12;

import java.util.Vector;

public class EnumEg {

	Day day = Day.MONDAY;

	public static void main(String[] a) {

		Day today = Day.WEDNESDAY;
		printWeekend(today);
		
		today = Day.SUNDAY;
		printWeekend(today);
		Vector<String> vs = new Vector<>();

	}


// an enum type can be used as local variable, parameter
	static public void printWeekend(Day today) {
		if (today == Day.SATURDAY) {
			System.out.println("It's Weekend, Saturday");
		} else if (today == Day.SUNDAY) {
			System.out.println("It's Weekend, Sunday");
		} else {
			System.out.println("Its not weekend");
		}


		switch (today) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday");
			break;
		default:
			System.out.println("Today is NOT Monday,Tuesday, Wednesday or Thursday");
		}
	}

//an enum type can be used as return type
	Day getSunday() {
		return Day.SUNDAY;
	}

}