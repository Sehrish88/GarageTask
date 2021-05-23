package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	protected List<Vehicle> storage = new ArrayList<>();
	public void addVehicle(Vehicle input){
		storage.add(input); 
		//remove method that accepts index or type use clear method to empty garage, implement bill method 
		
		
	}
	public void removeVehicle(int indexNum){
		storage.remove(indexNum);
	}
}
