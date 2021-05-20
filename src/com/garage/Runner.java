package com.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Car fam = new Car();
		fam.setName("Fahira");
		garage.addVehicle(fam.getName());

		String s = fam.getType();
		System.out.println(s);
		System.out.println(fam.getName());
		System.out.println(garage.getVehicles());
	}

}
