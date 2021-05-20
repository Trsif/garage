package com.garage;

public class Moto extends Vehicle {
	private String name;
	private int wheel = 2;

	public String setName(String name) {
		return this.name = name;
	}

	String getType() {
		return "Motorcycle";
	}

	String getName() {

		return name;
	}

	String getParts() {

		return "Motorcycle-part";
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

}
