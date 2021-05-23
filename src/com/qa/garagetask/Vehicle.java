package com.qa.garagetask;

public abstract class Vehicle implements Specs {
	public String make;
	public String model;
	public int year;
	public String color;
	public int licensePlate; 
	
	
	public Vehicle(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		
	}
	
} 
