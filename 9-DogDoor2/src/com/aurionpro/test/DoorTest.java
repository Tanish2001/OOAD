package com.aurionpro.test;

import com.aurionpro.model.BarkRecognizer;
import com.aurionpro.model.DogDoor;
import com.aurionpro.model.Remote;

public class DoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor d = new DogDoor();
		BarkRecognizer b = new BarkRecognizer(d);
		Remote r = new Remote(d);
		System.out.println();
//		r.pressButton();
		System.out.println("Fido barks");
		b.recognize("Woof");
		System.out.println("Fido went outside");
		System.out.println("Fido is done");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fido is stuck outside");
		System.out.println("Fido starts barking");
		b.recognize("Woof");
		System.out.println("Fido is back");
//		r.pressButton();
	}

}
