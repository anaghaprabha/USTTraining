package com.learning.day6.p7;

import com.learning.day6.p5.PermanentEmployee;
import com.learning.day6.p6.TemporaryEmployee;

public class MainProgram {

	public static void main(String[] args) {
		PermanentEmployee pobj = new PermanentEmployee(12, "Sachin", 514.6f, "test address");
		pobj.displayp();
		TemporaryEmployee tobj = new TemporaryEmployee(13, "Saurav", 321.09f, "contract address");
		tobj.displayt();
	}

}
