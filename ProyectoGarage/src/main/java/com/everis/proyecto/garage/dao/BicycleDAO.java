package com.everis.proyecto.garage.dao;

import com.everis.alicante.courses.beca.garage.domain.Bicycle;

public class BicycleDAO extends AbstractGarageDAO<Bicycle>{

	private static BicycleDAO instance;
	private String path = "";

	private BicycleDAO() {
	}

	public static BicycleDAO getInstance() {
		if (instance == null) {
			instance = new BicycleDAO();
		}
		return instance;
	}

	@Override
	String getFilePath() {
		return path;
	}

	@Override
	Bicycle build(String... strings) {
		return new Bicycle(strings[0],strings[1]);
	}
}
