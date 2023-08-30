package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;

public class TaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator taxc = new TaxCalculator();
		System.out.println(taxc.calculateTax(100, 10));
		System.out.println(taxc.calculateTax(99, 0));
	}

}
