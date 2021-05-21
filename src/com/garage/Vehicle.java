package com.garage;

abstract class Vehicle {
	abstract String getType();

	abstract String getName();

	abstract String getParts();

	public int value;

	public Vehicle(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
