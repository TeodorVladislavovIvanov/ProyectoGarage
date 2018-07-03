package com.everis.proyecto.garage.dao;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;
import com.everis.alicante.courses.beca.garage.domain.Car;

public class CarDAO extends AbstractGarageDAO<Car>{

	private static CarDAO instance;
	private String path = "";

	private CarDAO() {
	}

	public static CarDAO getInstance() {
		if (instance == null) {
			instance = new CarDAO();
		}
		return instance;
	}

	@Override
	String getFilePath() {
		return path;
	}

	@Override
	Car build(String... strings) {
		return new Car(strings[0],strings[1],strings[2]);
	}
	
}
