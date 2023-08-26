package com.aurionpro.model;

public class EmployeeLogic {
	static double tax = 0;

	// public EmployeeLogic(Employee employee) {
	public static double calculateTotalSalary(Employee emp) {
		return emp.basic + emp.hra + emp.da + emp.ta;
	}

	public static double calculateTax(Employee emp) {
		if (calculateTotalSalary(emp) * 12 > 500000 && calculateTotalSalary(emp) * 12 < 800000) {
			EmployeeLogic.tax = 10;
			return calculateTotalSalary(emp) * 12 * 10 / 100;
		} else if (calculateTotalSalary(emp) * 12 > 800000 && calculateTotalSalary(emp) * 12 < 1000000) {
			EmployeeLogic.tax = 20;
			return calculateTotalSalary(emp) * 12 * 20 / 100;
		} else {
			EmployeeLogic.tax = 30;
			return calculateTotalSalary(emp) * 12 * 30 / 100;
		}
	}

}
