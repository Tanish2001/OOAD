package com.aurionpro.model;

public class GuitarSpec {
	Builder builder;
	String model;
	Type type;
	Wood backWood;
	Wood topWood;
	private int numberOfStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numberOfStrings) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numberOfStrings = numberOfStrings;
	}

	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public boolean matches(GuitarSpec specs) {
		if(this.getBuilder()==specs.getBuilder() && this.getBackWood()==specs.getBackWood() && 
				this.getModel().equalsIgnoreCase(specs.getModel()) && this.getNumberOfStrings()==specs.getNumberOfStrings()
				&& this.getTopWood()==specs.getTopWood() && this.getType()==specs.getType()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "GuitarSpec [builder=" + builder + ", model=" + model + ", type=" + type + ", backWood=" + backWood
				+ ", topWood=" + topWood + ", numberOfStrings=" + numberOfStrings + "]";
	}
	
	

}