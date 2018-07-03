package com.everis.proyecto.garage.manager;


import com.everis.alicante.courses.beca.garage.domain.MotorBike;

public class MotorBikeManager extends AbstractVehicleManager<MotorBike>{


	private static MotorBikeManager instance;

	private MotorBikeManager() {
	}

	public static MotorBikeManager getInstance() {
		if (instance == null) {
			instance = new MotorBikeManager();
		}
		return instance;
	}


}
