package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Guitar> guitarList = new ArrayList<Guitar>();
	
	public void addGuitar(String serialNumber,double price,GuitarSpec spec){
		Guitar newGuitar = new Guitar(serialNumber, price, spec);
		guitarList.add(newGuitar);
	}
	
	public List<Guitar> getInventory() {
		return guitarList;
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitarList) {
			if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> searchGuitar(GuitarSpec spec) {
		List<Guitar> searchResults = new ArrayList<Guitar>();
		for (Guitar guitar2 : guitarList) {
			if(spec.matches(guitar2.getSpecs())) {
				searchResults.add(guitar2);
			}
		}
		return searchResults;
	}
}
