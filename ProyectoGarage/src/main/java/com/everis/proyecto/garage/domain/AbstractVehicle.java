package com.everis.proyecto.garage.domain;

public abstract class AbstractVehicle implements Vehicle {
	
	private String  color, model;
	private Integer numWheels;
	
	@Override
	public String toString() {
		return "XXXXXXX\t\t"+model+"\n";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(Integer numWheels) {
		this.numWheels = numWheels;
	}	
}
