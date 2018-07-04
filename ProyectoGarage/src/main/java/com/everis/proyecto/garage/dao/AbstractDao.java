package com.everis.proyecto.garage.dao;

public class AbstractDao<T>{

	protected static final String FIND_ALL = "SELECT * FROM %s;";
	protected static final String FIND_BY_ID = "SELECT * FROM %s WHERE %s = %s;";
	
}
