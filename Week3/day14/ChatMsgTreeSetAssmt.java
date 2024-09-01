package com.learning.day14;

import java.util.*;

class ChatMessages{
	private String participantname;
	private String message;
	
	public String toString() {
		return "[participantname = " + participantname + ", message = " + message + "]";
	}
	public ChatMessages(String participantname, String message) {
		
		this.participantname = participantname;
		this.message = message;
	}
	public String getParticipantname() {
		return participantname;
	}
	public void setParticipantname(String participantname) {
		this.participantname = participantname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
/* #2. Use treeset for above application to store chat objects, sort based on ascending
 * order of participant names.
*/
public class ChatMsgTreeSetAssmt {
	
	public static void main(String[] args) {
		
		//Creating a TreeSet to store chat objects in ascending order
		TreeSet <ChatMessages> tset = new TreeSet<>((s1, s2) -> s1.getParticipantname().compareTo(s2.getParticipantname()));
		
		//Adding chat objects to TreeSet
		tset.add(new ChatMessages("P2","error"));
		tset.add(new ChatMessages("P4","wip"));
		tset.add(new ChatMessages("P1","wip"));
		tset.add(new ChatMessages("P3","done"));
		tset.add(new ChatMessages("P6","okay"));
		tset.add(new ChatMessages("P5","ok"));
				
		/*list all chat messages in ascending order by participants' name*/
		System.out.print("\n.......Listing all chat messages in ascending order of participant name........\n\n");
		display(tset);
		System.out.print("..........................................\n\n");
		
		
        /*list all chat messages in reversed order*/
		NavigableSet<ChatMessages> tset2 = tset.reversed();
		System.out.print("\n.......Listing all chat messages in descending order of participant name........\n\n");
		display((TreeSet<ChatMessages>) tset2);
		System.out.print("..........................................\n\n");
		
	
	}
	
	
	static void display(TreeSet<ChatMessages> cmsgs) {
		
		for(ChatMessages str: cmsgs) {
			System.out.print(str+"\n");
		}
	}
	


}
