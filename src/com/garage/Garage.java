package com.garage;

import java.util.ArrayList;

public class Garage extends Vehicle {
	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void addVehicle(Vehicle... vehicle) {
		for (Vehicle i : vehicle) {
			vehicles.add(i);
		}

	}

	public void vehicles() {

		for (int i = 0; i < vehicles.size(); i++) {
			System.out.print(vehicles.get(i).toString());
		}
	}

	String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	String getParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
