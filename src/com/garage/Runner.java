package com.garage;

public class Runner {

	public static void main(String[] args) {

		Car c = new Car(1);
		Boat b = new Boat(4);
		Moto m = new Moto(3);
		Garage garage = new Garage();
		vehiclasIn(garage, c, b, m);
		System.out.println(garage);
		c.setName("Fahira");
		b.setName("True-Boat");
		System.out.println(b.getName());

	}

	public static void vehiclasIn(Garage garage, Vehicle... t) {
		garage.addVehical(t);

	}
}
