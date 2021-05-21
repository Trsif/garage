package com.garage;

public class Boat extends Vehicle {
	private String name;

	@Override
	String getType() {

		return "boat";
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	String getParts() {

		return "Boat-part";
	}

	public void setName(String name) {
		this.name = name;
	}

}
