package com.aurionpro.model;

public class TaxCalculator {
	
	DBLogger dblogger;
	
	public TaxCalculator() {

	}

	public DBLogger getDblogger() {
		return dblogger;
	}

	public void setDblogger(DBLogger dblogger) {
		this.dblogger = dblogger;
	}
	
	public int calculateTax(int amount,int rate) {
		int tax=0;
		try {
			tax=amount/rate;
//			int m=10/0;
		}
		catch (ArithmeticException e) {
			new DBLogger().log("Divide by zero");
		}
		return tax;
	}
}
