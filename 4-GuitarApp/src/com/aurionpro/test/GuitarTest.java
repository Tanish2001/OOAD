package com.aurionpro.test;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory i = new Inventory();
		i.addGuitar("1", 20, "build", "Aries", "Guitar", "Alder", "Alder");
		i.addGuitar("2", 60, "build", "A2", "Guitar", "Black Limba", "Black Limba");
		i.addGuitar("3", 600, "build", "DC", "Guitar", "Walnut", "Walnut");
		i.addGuitar("4", 900, "build", "DC", "Guitar", "Walnut", "Walnut");
		i.addGuitar("5", 200, "build", "DC", "Guitar", "Walnut", "Walnut");

		
		System.out.println(i.getInventory());;
//		System.out.println(i.getGuitar("3"));
		Guitar g =  new Guitar("1", 0, "build", "DC", "GuiTar", "WalNut", "WalnuT");
		System.out.println(i.searchGuitar(g));
	}
	

}
