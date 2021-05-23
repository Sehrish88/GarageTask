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
		
	}
	@Override
	public void servic() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	
}
