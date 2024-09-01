package com.learning.day14;

import java.util.*;

class ChatMsgs{
	private String participantname;
	private String message;
	
	public String toString() {
		return "[participantname = " + participantname + ", message = " + message + "]";
	}
	public ChatMsgs(String participantname, String message) {
		
		this.participantname = participantname;
		this.message = message;
	}	
}

public class ChatMsgLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList <ChatMsgs> cmsgs = new LinkedList<>();
		cmsgs.add(new ChatMsgs("P1","wip"));
		cmsgs.add(new ChatMsgs("P2","error"));
		cmsgs.add(new ChatMsgs("P3","done"));
		cmsgs.add(new ChatMsgs("P4","wip"));
		
		/* #1. Develop an application using LinkedList, and store Chat Messages(as objects),
		    display, reverse and again display reversed LinkedList
		*/
		
		/*list all chat messages*/
		display(cmsgs);
		
		/*reverse chat messages using .reversed method*/		
		LinkedList <ChatMsgs> rmsg = cmsgs.reversed();
		System.out.println("\nAfter reversing using .reversed method");
		display(rmsg);
		
		/*reverse chat messages using Collections.reverse method*/	
		reverseList(cmsgs);	
		//display reversed LinkedList
		display(cmsgs);
		
		
		/*//remove first message
		cmsgs.removeFirst();
		System.out.println("\nAfter removing first element");
		display(cmsgs); */
	}
	
	static void display(LinkedList<ChatMsgs> cmsgs) {
		
		for(ChatMsgs str: cmsgs) {
			System.out.print(str+"\n");
		}
	}
	
    static LinkedList<ChatMsgs> reverseList(LinkedList<ChatMsgs> cmsgs) {
    	
		System.out.println("\nAfter reversing using Collections.reverse method");
		Collections.reverse(cmsgs);
		return cmsgs;
	}

}
