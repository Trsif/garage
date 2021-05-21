package com.garage;

public class Runner {

	public static void main(String[] args) {

		Car c = new Car(1200, "Mozirati");
		Boat b = new Boat(40000, "Serenity");
		Moto m = new Moto(3500, "Thunderbolt");
		Garage garage = new Garage();
		vehiclasIn(garage, c, b, m);
		System.out.println(garage);
		c.setName("Fahira");
		b.setName("True-Boat");
		System.out.println(b.getName());
		garage.calculate_Bill();
	}

	public static void vehiclasIn(Garage garage, Vehicle... t) {
		garage.addVehical(t);

	}
}
