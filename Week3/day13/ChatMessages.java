package com.learning.day13;

import java.util.*;
import java.util.List;

public class ChatMessages {

	public static void main(String[]
		 args) {
		
		ArrayList <String> cmsgs = new ArrayList<>();
		cmsgs.add("P1 - In Progress");
		cmsgs.add("P2 - error");
		cmsgs.add("P3 - Done");
		cmsgs.add("P4 - Done");
		cmsgs.add("P5 - In Progress");
		cmsgs.add("P6 - completed");
		cmsgs.add("P7 - Welcome");
		cmsgs.add("P6 - done");
		cmsgs.add("P5 - COMPLETED");
		/*list all chat messages
		
		//how many times a participant has responded:
		 * for each
		 * enhanced for
		 * Iterator
		*/
		
		for(String msg : cmsgs) {
		    msg.toLowerCase();
			System.out.println(msg);
		}
		
		System.out.println("\nChecking Counts: \n");
		int done = 0, notdone = 0, error = 0, others=0; 
		for (String msg : cmsgs) {
		    msg = msg.toLowerCase();
			if(msg.indexOf("done")>0 || msg.indexOf("completed")>0) {
				//System.out.println("Done messages: "+msg);
				done++;
			}
			else if(msg.indexOf("in progress")>0 ){
				//System.out.println("WIP messages: "+msg);
			notdone++;
			}
			else if (msg.indexOf("error")>0 ){
				//System.out.println("error messages: "+msg);
			error++;
			}
			else{
			others++;
			}
			
		}
		System.out.println("Completed Count: "+done);
		System.out.println("WIP Count: "+notdone);
		System.out.println("Error Count: "+error);
		System.out.println("Others Count: "+others);
		
		//1 - add 3rd element in between with some text
		cmsgs.add(3, "Trainer - Any questions?");
		System.out.println("***************************");
		System.out.println("After adding 3rd element: \n");
		display(cmsgs);
		//2- replace 4th element
		
		cmsgs.set(4, "P8 - In Progress");
		System.out.println("***************************");
		System.out.println("After replacing 4th element: \n");
		display(cmsgs);
		//3 - remove 2nd element
		cmsgs.remove(2);
		System.out.println("***************************");
		System.out.println("\nAfter modifications: \n");
		display(cmsgs);
		
		Collections.shuffle(cmsgs);
		System.out.println("***************************");
		System.out.println("\nMsgs after modifications: \n");
		display(cmsgs);

	}
	
	static void display(List <String> list) {
		
		for(String str: list) {
			System.out.print(str+"\t");
		}
	}

}
