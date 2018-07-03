package com.everis.proyecto.garage.domain;

public class Car extends AbstractVehicle{

	private String plate;

	public Car(String plate, String color, String model) {
		super.setColor(color);
		super.setModel(model);
		super.setNumWheels(4);
		this.plate = plate;
	}
	

	@Override
	public String toString() {
		return plate+"\t\t"+super.getModel()+"\n";
	}
	
}
