package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Guitar> guitarList = new ArrayList<Guitar>();
	
	public void addGuitar(String serialNumber,double price,String builder,String 						model,String type,String backwood,String topwood) {
		Guitar newGuitar = new Guitar(serialNumber, price, builder, model, type, backwood, 										topwood);
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
	
	public List<Guitar> searchGuitar(Guitar guitar) {
		List<Guitar> searchResults = new ArrayList<Guitar>();
		for (Guitar guitar2 : guitarList) {
			if(guitar.getType().equalsIgnoreCase(guitar2.getType()) && guitar.getTopWood().equalsIgnoreCase(guitar2.getTopWood()) && guitar.getModel().equalsIgnoreCase(guitar2.getModel()) && guitar.getBuilder().equalsIgnoreCase(guitar2.getBuilder()) && guitar.getBackWood().equalsIgnoreCase(guitar2.getBackWood())) {
//				System.out.println("found");
				searchResults.add(guitar2);
			}
		}
		return searchResults;
	}
}
