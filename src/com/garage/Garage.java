package com.garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<String> vehiclesIn = new ArrayList<>();

	public ArrayList<String> getVehicles() {
		return vehiclesIn;
	}

	public void setVehicles(ArrayList<String> vehicles) {
		this.vehiclesIn = vehicles;
	}

	public void addVehicle(String... vehicles) {
		for (String i : vehicles) {
			vehiclesIn.add(i);
		}
	}

}
