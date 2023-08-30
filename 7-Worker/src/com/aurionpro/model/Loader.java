package com.aurionpro.model;

public class Loader implements IWorker{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Started Working";
	}

	@Override
	public String rest() {
		// TODO Auto-generated method stub
		return "Resting";
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Started Working";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stopped working";
	}

}
