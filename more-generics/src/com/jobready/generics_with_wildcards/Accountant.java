package com.jobready.generics_with_wildcards;

public class Accountant extends Employee {

	//@Override annotation lets compiler (and other developers) know that this
	//class' work() method should override its parent's work() method
	@Override
	public void work() {
		System.out.println("Accountant working");
	}
}
