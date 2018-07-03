package com.everis.proyecto.garage.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.garage.domain.Vehicle;

public abstract class AbstractGarageDAO<T extends Vehicle> {

	private List<T> elements = new ArrayList<T>();
	private File file;

	public List<T> list() {
		return elements;
	}

	public void save(final T element) {
		
	}

	public void delete(final T element) {
		elements.remove(element);
	}

	public T get(final int i) {
		return elements.get(i);
	}

	abstract String getFilePath();

	abstract T build(String... strings);

}
