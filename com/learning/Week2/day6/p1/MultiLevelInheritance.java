package com.learning.day6.p1;

class A{
	private int i;

	A(int i)
	{
		this.i/* data member*/ = i/*parameter*/;
		System.out.println("A(int i)");
	}
	
	public void show()
	{
		System.out.println("Value of A.i is: "+i);
	}
}

class B extends A{
	private int j;
	public B(int p,int j)
	{
		super(p); //shud be first statment in cosntructor
		this.j = j; 
		System.out.println("B(int i,int j)");
	}
	public void show()
	{
		super.show();
		System.out.println("Value of B.j is: "+j);
	}
}

class C extends B{
	private int k;
	public C(int i,int j,int k)
	{
		super(i,j);
		this.k = k;
		System.out.println("C(int i,int j,int k)");
	}
	
	public void show()
	{
		
		System.out.println("Value of C.k is: "+k);
		super.show();
	}
}

class D extends C{
	private float l;
	
	
	public D(int i, int j, int k, float l) {
		super(i, j, k);
		this.l = l;
		System.out.println("D(int i,int j,int k,float l)");
	}


	public void show()
	{
		
		System.out.println("Value of d.l is: "+l);
		super.show();
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		A obj = new C(10,20,30);
		obj.show();
		System.out.println("_________________________\n");
		A obj1 = new D(10,20,30,40.9f);
		obj1.show();
	}

}
