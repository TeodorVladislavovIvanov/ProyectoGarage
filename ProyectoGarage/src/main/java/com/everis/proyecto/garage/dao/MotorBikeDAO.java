package com.everis.proyecto.garage.dao;

import com.everis.alicante.courses.beca.garage.domain.Car;
import com.everis.alicante.courses.beca.garage.domain.MotorBike;

public class MotorBikeDAO extends AbstractGarageDAO<MotorBike>{

	private static MotorBikeDAO instance;
	private String path = "";

	private MotorBikeDAO() {
	}

	public static MotorBikeDAO getInstance() {
		if (instance == null) {
			instance = new MotorBikeDAO();
		}
		return instance;
	}
	
	
	@Override
	String getFilePath() {
		return path;
	}

	@Override
	MotorBike build(String... strings) {
		return new MotorBike(strings[0],strings[1],strings[2]);
	}
	
}
