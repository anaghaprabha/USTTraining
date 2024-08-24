package com.learning.day7;

public class AbstractExample {

	public static void main(String[] args) {
		
		Animal horse = new Horse("Horse","Push off the ground with its legs","Snort");
		horse.eat();
		horse.move();
		horse.sound();
		
		// Animal animal1 = new Animal(); -- Cannot instantiate type Animal as its abstract
		System.out.println();
		Animal cat = new Cat("Cat", "linear locomotion", "Meow");
		cat.eat();
		cat.move();
		cat.sound();
	}

}

//Abstract Class
abstract class Animal {
	
	private String name;
	private String sounds;
	private String movement;
	
	public Animal(String name, String movement, String sounds) {
		this.movement  = movement;
		this.name = name;
		this.sounds = sounds;
		
	}

	abstract void move();
	abstract void sound();
	
	void eat() {
		System.out.println("Animal Eating Sample");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSounds() {
		return sounds;
	}

	public void setSounds(String sounds) {
		this.sounds = sounds;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}
	
}

//Concrete Class
class Horse extends Animal{

	Horse(String name, String movement, String sounds){
		super(name,movement,sounds);
		
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" moves by "+ getMovement());
		
	}
	
	void eat() {
		System.out.println(getName()+" eats hay & grass");
	}
	@Override
	void sound() {
		System.out.println(getName()+" makes "+getSounds()+ " sound");
	}
	
}

//Concrete Class
class Cat extends Animal{

	public Cat(String name, String movement, String sounds) {
		super(name, movement, sounds);
		// TODO Auto-generated constructor stub
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" moves by "+ getMovement());
		
	}
	
	void eat() {
		System.out.println(getName()+" likes fruits, veggies, meat & fish ");
	}
	@Override
	void sound() {
		System.out.println(getName()+" makes "+getSounds()+ "sound");
	}
	
	
}