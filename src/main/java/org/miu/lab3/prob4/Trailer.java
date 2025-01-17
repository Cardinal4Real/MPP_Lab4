package org.miu.lab3.prob4;

public class Trailer extends Property{
	private static final double RENT = (double)500.0F;
	public Trailer() {
		super(new Address("4th Street","Fairfield","Iowa","52557"));
	}

	public double computeRent(){
		return RENT;
	}
}
