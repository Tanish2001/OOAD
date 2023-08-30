package com.aurionpro.test;

import com.aurionpro.model.IWorkable;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Loader;
import com.aurionpro.model.Robot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker worker = new Loader();
		System.out.println(worker.start());
		System.out.println(worker.eat());
		System.out.println(worker.rest());
		System.out.println(worker.stop());
		
		IWorkable robot = new Robot();
		System.out.println(robot.start()+"\n"
		+robot.stop());
	}

}
