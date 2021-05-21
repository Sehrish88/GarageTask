package com.qa.garagetask;

public class Car extends Vehicle {
	public boolean isElectric; 
	public Car(String make, String model, int year, String color, boolean isElectric) {
		super(make, model, year, color);
		// TODO Auto-generated constructor stub
		this.isElectric = isElectric; 
		
	}
	
}
