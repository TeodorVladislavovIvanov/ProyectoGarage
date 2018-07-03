package com.everis.proyecto.garage.manager;


import com.everis.alicante.courses.beca.garage.domain.Car;

public class CarManager extends AbstractVehicleManager<Car>{

	private static CarManager instance;

	private CarManager() {
	}

	public static CarManager getInstance() {
		if (instance == null) {
			instance = new CarManager();
		}
		return instance;
	}
	
}
