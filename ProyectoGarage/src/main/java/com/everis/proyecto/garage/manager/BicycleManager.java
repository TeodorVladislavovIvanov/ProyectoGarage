package com.everis.proyecto.garage.manager;

import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;

public class BicycleManager extends AbstractVehicleManager<Bicycle>{
	
	private static BicycleManager instance;

	private BicycleManager() {
	}

	public static BicycleManager getInstance() {
		if (instance == null) {
			instance = new BicycleManager();
		}
		return instance;
	}
	
	
}
