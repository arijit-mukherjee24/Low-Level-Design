package com.handlenullobject;

public class Main {

	public static void main(String args[]) {

		Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");   // Bike object doesn't exist, so returning Null Object instead of NULL.
		printVehicleDetails(vehicle);
		
		Vehicle vehicle2 = VehicleFactory.getVehicleObject("Car");
		printVehicleDetails(vehicle2);
	}

	private static void printVehicleDetails(Vehicle vehicle) {
		System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
		System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
	}
}

/*
Note: 

NULL OBJECT DESIGN PATTERN

- A null object replaces NULL return type.

- No need to put IF CHECK for checking NULL

- NULL Object reflects do Nothing or Default behavior

*/

/*
Output:

Seating Capacity: 0
Fuel Tank Capacity: 0

Seating Capacity: 5
Fuel Tank Capacity: 40
*/