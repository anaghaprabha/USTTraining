package com.learning.day7;

public class FinalEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalSample fs = new FinalSample();
		fs.setName("Final Name");
		System.out.println(fs.toString());
		
		final FinalSample fs1 = new FinalSample();
		fs1.setName("Final Name of Final Object");
		System.out.println(fs1.toString());
	}

}

class FinalSample{
	
	private final int id = 1;
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return id;
	}
	@Override
	public String toString() {
		return "FinalSample [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
