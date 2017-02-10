package edu.jalc.inclass.label;


import edu.jalc.inclass.color.RGBcolor;
import edu.jalc.inclass.logo.DrPepperLogo;

public class SodaBottleLabel {

	private final double height;
	private final RGBcolor rgbcolor;
	private final DrPepperLogo drPepperLogo;

	private SodaBottleLabel(){
		this.height = 0;
		this.rgbcolor = null;
		this.drPepperLogo = null;
	}

	public SodaBottleLabel(double height, RGBcolor rgbcolor, DrPepperLogo drPepperLogo){
		this.height = height;
		this.rgbcolor = rgbcolor;
		this.drPepperLogo = drPepperLogo;
	}

	public double getHeight() {
		return height;
	}

	public RGBcolor getRGBcolor() {
		return rgbcolor;
	}

	public DrPepperLogo getDrPepperLogo() {
		return drPepperLogo;
	}
}
