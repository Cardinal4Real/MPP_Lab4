package org.miu.lab3.prob4;

public class Condo extends Property{

	private int numberOfFloors;
	
	public Condo(int numberOfFloors) {
		super(new Address("Spintex Road","Des Moines","Iowa","52991"));
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 400 * numberOfFloors;
	}
}
