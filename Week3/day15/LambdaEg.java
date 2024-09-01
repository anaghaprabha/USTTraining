package com.learning.day15;

import java.util.*;


// 1. Develop an application using LinkedList,
//and store Chat Messages(as objects), 
//display, reverse and again display reversed LinkedList
class Chats {
	private String sender_name;
	private String msg;

	public Chats(String sender_name, String msg) {
		super();
		this.sender_name = sender_name;
		this.msg = msg;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Chats [sender_name=" + sender_name + ", msg=" + msg + "]";
	}
}

public class LambdaEg {
	public static void main(String[] args) {
		
		/*class TSComparator implements Comparator<Chats> {

			@Override
			public int compare(Chats o1, Chats o2) {
				String name1 = o1.getSender_name();
				String name2 = o2.getSender_name();
				return name1.compareTo(name2);
			}

		}*/
		
		//Anonymous Inner class
		/*Comparator<Chats> mcmp = new Comparator<Chats>(){
			@Override
			public int compare(Chats o1, Chats o2) {
				String name1 = o1.getSender_name();
				String name2 = o2.getSender_name();
				return name1.compareTo(name2);
			}
		};*/
		
		TreeSet<Chats> cmsgs = new TreeSet<>((o1, o2)->(o1.getSender_name()+o1.getMsg()).compareTo((o2.getSender_name()+o2.getMsg())));
		
		cmsgs.add(new Chats("name6", "msg1"));
		cmsgs.add(new Chats("name2", "msg2"));
		cmsgs.add(new Chats("name1", "msg3"));
		cmsgs.add(new Chats("name1", "msg4"));

		display(cmsgs);
        //write lambda which sorts based on msg order
		Chats msg1 = Collections.min(cmsgs, (c1,c2) ->c1.getMsg().compareTo(c2.getMsg()));
		
		System.out.println("\nCollections.min - " +msg1);
		System.out.println("\n-----Filter msgs below-----");
		cmsgs.stream().filter((e)->e.getSender_name().equalsIgnoreCase("name1"))
		.forEach((item) -> {System.out.println(item);});
		System.out.println("-----------------------------------------");
		
		
		 //Collections.max
		Chats msg2 = Collections.max(cmsgs, (c1,c2) ->c1.getMsg().compareTo(c2.getMsg()));
		
		System.out.println("\nCollections.max - " +msg2);
		
		
		
		/*Assignment #1. Make changes in TreeSet with Chat Messages, to use Streams, and filter messages from
		 *  specific sender(at least two senders)?
		 */
		
		System.out.println("\n-----Filter msgs below for 2 senders-----");
		cmsgs.stream().filter((e)->e.getSender_name().equalsIgnoreCase("name1") ||e.getSender_name().equalsIgnoreCase("name2") )
		.forEach((item) -> {System.out.println(item);});
		System.out.println("-----------------------------------------");
	}

    
	static void display(TreeSet<Chats> cmsgs) {
		for (Chats cmg : cmsgs) {
			System.out.println(cmg + "\t");
		}
	}
}