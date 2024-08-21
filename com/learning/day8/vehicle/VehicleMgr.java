package com.learning.day8.vehicle;



public class VehicleMgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle [] = new Vehicle[5];
        vehicle[0] = new Car("Honda", "City");
        vehicle[1] = new Bus("Tata","School");
        
    
		System.out.println(vehicle[0].toString());
		System.out.println(vehicle[1].toString());
		
//		Vehicle v = new Vehicle();
//		System.out.println(v.toString());

		

	}

}

