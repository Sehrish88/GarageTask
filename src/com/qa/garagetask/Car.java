package com.qa.garagetask;

public class Car extends Vehicle {
	public boolean isElectric; 
	
	public Car(String make, String model, int year, String color, boolean isElectric) {
		super(make, model, year, color);
		// TODO Auto-generated constructor stub
		this.isElectric = isElectric; 
		
	}
	@Override
	public void oilChange() {
		// TODO Auto-generated method stub
		System.out.println("The service lights are blinking, time for an oil change!"); 
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("The service lights are blinking, time to get your car serviced!"); 
		
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Vroom vroom! The car is accelerating!"); 
		
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("You hit the brakes, the car is slowing down..."); 
		
	}
	
} 
