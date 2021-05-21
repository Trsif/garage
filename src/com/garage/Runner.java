package com.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Car c = new Car();
		Boat b = new Boat();
		Moto m = new Moto();
		garage.addVehicle();
		c.setName("Fahira");
		b.setName("BoatTrue");
		garage.addVehicle(c, b, m);
		System.out.println(b.getName());
		garage.vehicles();

	}

}
