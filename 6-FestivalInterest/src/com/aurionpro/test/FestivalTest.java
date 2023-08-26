package com.aurionpro.test;

import com.aurionpro.model.DiwaliInterest;
import com.aurionpro.model.FixedDeposite;
import com.aurionpro.model.HoliInterest;

public class FestivalTest{

	public static void main(String[] args){

		FixedDeposite fd = new FixedDeposite("Ban", 1000, 2,new DiwaliInterest());
		FixedDeposite fd1 = new FixedDeposite("Tan", 1000, 2,new HoliInterest());
		printInfo(fd);
		printInfo(fd1);
		
	}
	
	public static void printInfo(FixedDeposite fd) {
		System.out.println("===================================================");
		System.out.println("Name: "+fd.getName()+"\nPrincipal Amount: "+fd.getPrincipal()+"\nDuration: "+fd.getDuration()+
				"\nFestivale Name: "+fd.getInterest().getName()+"\nSimple Interest: "+fd.calculateSI());
		System.out.println("===================================================");
	}

}
