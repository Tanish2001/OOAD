package com.aurionpro.model;

public class printUtil {
	public void printSalarySlip(Employee emp) {
		System.out.println("Salary of " + emp.name + " is " + EmployeeLogic.calculateTotalSalary(emp) + " and tax is "
				+ EmployeeLogic.calculateTax(emp) + " imposed tax is " + EmployeeLogic.tax + "% and annual salary is "
				+ EmployeeLogic.calculateTotalSalary(emp) * 12+"\n Basic is "+emp.getBasic()
				+"\n HRA is "+emp.getHra()+"\n DA is "+emp.getDa()+"\n TA is "+emp.getTa());
	}
}
