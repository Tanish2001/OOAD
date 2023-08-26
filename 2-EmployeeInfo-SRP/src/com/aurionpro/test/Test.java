package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.printUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "Ban", 50000);
		Employee e2 = new Employee(2, "Asis", 60000);
//		System.out.println(e1);
//EmployeeLogic el = new EmployeeLogic();
//System.out.println(el.);
//System.out.println(e1.calculateTax());
//e1.printSalarySlip();
		printUtil p = new printUtil();
		p.printSalarySlip(e1);
		p.printSalarySlip(e2);
	}

}
