package com.garage;

public class Boat extends Vehicle {
	public Boat(int value) {
		super(value);
		this.value = value * 2;
	}

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

	@Override
	public String toString() {
		return "Boat [name=" + name + ", value=" + value + "]";
	}

}
