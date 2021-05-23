package com.qa.garagetask;

public class Motorcycle extends Vehicle {
	public String type;

	public Motorcycle(String make, String model, int year, String color, String type) {
		super(make, model, year, color);
		// TODO Auto-generated constructor stub
		this.type = type; 
		
	}
	
	public void setType(String type) {
		if(type.equals("standard") || type.equals("cruiser") || type.equals("sport bike") || type.equals("scooter") || type.equals("moped")) {
			this.type = type;
		} else {
			this.type = "standard"; 
		}
		
	}

	@Override
	public void oilChange() {
		// TODO Auto-generated method stub
		System.out.println("Your motorcycle is due for an oil change!"); 
		
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		
		System.out.println("Your motorcycle is due for servicing"); 
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Vroooom! Your motor cycle is accelerating!");
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Your motorcycle is braking and slowing down!"); 
	}

}
