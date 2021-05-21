package com.garage;

class Car extends Vehicle {
	public Car(int value, String name) {
		super(value);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	private String name;
	private int mile;
	private String honk = "hunk";

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	public String getHonk() {
		return honk;
	}

	public void setHonk(String honk) {
		this.honk = honk;
	}

	public String setName(String name) {
		return this.name = name;
	}

	String getParts() {
		return "Car-parts";
	}

	String getType() {
		return "Car";
	}

	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [name = " + name + ", value = " + value + "]";
	}

}
