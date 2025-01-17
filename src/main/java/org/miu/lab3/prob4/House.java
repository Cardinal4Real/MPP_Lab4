package org.miu.lab3.prob4;

public class House extends Property{

	private double lotSize;
	
	
	public House(double lotSize) {
		super(new Address("Locust Street","Ottumwa","Iowa","52556"));
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
