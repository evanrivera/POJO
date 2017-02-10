package edu.jalc.inclass.logo;

public class DrPepperLogo {
	private final double height;

	private DrPepperLogo(){
		this.height = 0;
	}

	public DrPepperLogo(double height){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}
}
