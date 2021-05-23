package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	String garageName;
	
	public Garage(String garageName){
		this.garageName = garageName; 
	}
	
	
	
	protected List<Vehicle> storage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle input){
		storage.add(input); 
	}
	

	String getGarageName() {
		return garageName;
	}
	
	public void removeVehicle(int indexNum){
		storage.remove(indexNum);
	}
	
	public void emptyGarage() {
		storage.clear();
	}
	
	 public void vehicleServiceBill(Vehicle input) {
		 double totalCost = 0;
		 
		 for (Vehicle v: storage) {
			 if(v instanceof Car) {
				 totalCost += 500;
			 }
			 else if(v instanceof Truck) {
				 totalCost += 600;
			 } else {
				 totalCost += 300;
			 }
		 }
		 
		 System.out.println("Your total vehicle service bill is " + totalCost); 
	 }
}
