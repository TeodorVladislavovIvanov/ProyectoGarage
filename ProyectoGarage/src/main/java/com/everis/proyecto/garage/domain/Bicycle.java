package com.everis.proyecto.garage.domain;

public class Bicycle extends AbstractVehicle {

	public Bicycle(String color, String model) {
		super.setColor(color);
		super.setModel(model);
		super.setNumWheels(2);
	}
	

}
