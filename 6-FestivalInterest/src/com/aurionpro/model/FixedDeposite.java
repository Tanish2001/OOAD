package com.aurionpro.model;

public class FixedDeposite {
	static int ID=0;
	String name;
	double principal;
	int duration;
	IFestivalInterest interest;
	private int id;
	
	public FixedDeposite(String name, double principal, int duration, IFestivalInterest interest) {
		super();
		this.id= FixedDeposite.ID++;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "FixedDeposite [name=" + name + ", principal=" + principal + ", duration=" + duration + ", interest="
				+ interest + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public IFestivalInterest getInterest() {
		return interest;
	}

	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double calculateSI() {
		return getPrincipal()*(1+getInterest().getInterestRate()*getDuration());
	}

	
	
	
	
	
}
