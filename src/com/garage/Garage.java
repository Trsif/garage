package com.garage;

import java.util.ArrayList;

public class Garage {
	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void addVehical(Vehicle... vehicle) {
		for (Vehicle i : vehicle) {
			vehicles.add(i);
		}
	}

	public int calculate_Bill() {
		for (int i = 0; i < vehicles.size(); i++) {

		}
		return 0;

	}

	@Override
	public String toString() {
		return "  vehicles=" + vehicles;
	}

}
