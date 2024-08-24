package com.learning.day4;

public class ClassLearning {

	
	public static void main(String[] args) {
		
		Product pobj1 = new Product(101,"Sofa Set");
		Product pobj2 = new Product(102,"Cupboard", 190.98f);

		Product pobj3 [] = new Product[5];
		pobj3[0]= new Product(112,"Computer", 110.98f);  
		pobj3[1]= new Product(113,"Clothing", 117.98f);  
		pobj3[2]= new Product(114,"Desk", 112.98f);  
		pobj3[3]= new Product(115,"Slide", 113.98f);  
		pobj3[4]= new Product(116,"Bag", 150.98f);  
		
		Product pobj4 [] = new Product[3];
		pobj4[0]= new Product(121,"Cycle");  
		pobj4[1]= new Product(122,"Scooter");  
		pobj4[2]= new Product(123,"Bike");  
		
//		pobj.id = 1;
//		pobj.name = "Laptop";
//		pobj.price = 14.56f;
//		
		pobj1.display();
		pobj2.display();

		System.out.println("\nInside 'Enhanced for' Loop");
		for(Product prod: pobj3)
		{
			
			prod.display();	
		}
		System.out.println("\nInside 'Normal for' Loop");
		for(int i=0; i<pobj4.length; i++) {
			
			pobj4[i].display();
		}
		
		
float price;
	}

}

class Product{
	int id;
	String name;
    float price;
    
    Product(){
    	id = 0;
    	name = "";
    	price = 0;
    }
	
    Product(int pid, String pname){
    	id = pid;
    	name = pname;
    }
    
    Product(int pid, String pname, float pprice){
    	id = pid;
    	name = pname;
    	price = pprice;
    }
	void display()
	{
		System.out.println("id: "+id+ "\t name: "+name+ "\t price: "+price);
	}
}


