package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1 = new Employee(1, "Ban", 50000);
System.out.println(e1);
System.out.println(e1.calculateTax());
System.out.println(e1.calculateTotalSalary());
e1.printSalarySlip();
	}

}
