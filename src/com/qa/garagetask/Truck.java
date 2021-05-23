package com.qa.garagetask;

public class Truck extends Vehicle{
	
	public String type; 

	public Truck(String make, String model, int year, String color, String type) {
		super(make, model, year, color);
		// TODO Auto-generated constructor stub
		this.type = "18 wheeler"; 
	}

	@Override
	public void oilChange() {
		// TODO Auto-generated method stub
		System.out.println("Your truck is due for an oil change!"); 
		
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("Your truck is due for servicing!"); 
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("The truck is accelerating, be careful!"); 
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("You hit the brakes, the truck is slowing down!!"); 
		
	}

}
