package com.learning.day9.list;

//Generic Class
public class GenericsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Wrapper <String> ws = new Wrapper<String>(); 
    

    Wrapper <City> cty = new Wrapper<City>();
   
   System.out.println(cty.toString()); 

	}


} 


class Wrapper<T>{
	
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}

	

}
