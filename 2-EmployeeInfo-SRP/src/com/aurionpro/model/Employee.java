package com.aurionpro.model;

public class Employee {
	int id;
	String name;
	double basic;
	double hra;
	double da;
	double ta;
	double tax;

	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = this.basic * 20 / 100;
		this.da = this.basic * 15 / 100;
		this.ta = this.basic * 10 / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", ta="
				+ ta + "]";
	}

//public void printSalarySlip() {
//	System.out.println("Salary of "+this.name+" is "+this.calculateTotalSalary()+" and tax is "+this.calculateTax()+" imposed tax is "+this.tax+"% and annual salary is "+this.calculateTotalSalary()*12);
//}

}
