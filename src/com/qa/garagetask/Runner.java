package com.qa.garagetask;

public class Runner {
	public static void main(String[] args) {
		Vehicle car1 = new Car("Mazda", "Mazda3", 2020, "red", false); 
		Vehicle car2 = new Car("Nissan", "Versa", 2017, "blue", false);
		
		Vehicle bike1 = new Motorcycle("Honda", "Honda Rebel 500", 2020, "black", "standard"); 
		Vehicle bike2 = new Motorcycle("BMW", "R9T", 2020, "blue", "standard");
		
		Vehicle truck1 = new Truck("Navistar", "Navistar ", 2020, "blue", "18 wheeler");
		Vehicle truck2 = new Truck("Volvo", "Volvo VNL ", 2019, "blue", "18 wheeler");
		
		Garage gar = new Garage("Balouch Auto"); 
		gar.addVehicle(car1);
		gar.addVehicle(car2);
		gar.addVehicle(bike1);
		gar.addVehicle(bike2);
		gar.addVehicle(truck1);
		gar.addVehicle(truck2);
		
		gar.removeVehicle(0);
		gar.getGarageName();
		
		gar.vehicleServiceBill(car1);
		gar.vehicleServiceBill(truck2);
		
		gar.emptyGarage();
	}
}
