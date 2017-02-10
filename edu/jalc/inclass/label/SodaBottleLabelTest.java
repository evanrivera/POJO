package edu.jalc.inclass.label;

import edu.jalc.inclass.color.RGBcolor;
import edu.jalc.inclass.logo.DrPepperLogo;

public class SodaBottleLabelTest {

	public void testGetHeight(){
		System.out.println("Testing SodaBottleLabel::getHeight");
		SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, null, null);
		assert(sodaBottleLabel.getHeight() == 1.0);
	}

	public void testGetRGBcolor(){
		System.out.println("Testing SodaBottleLabel::getRGBcolor");
		RGBcolor rgbcolor = new RGBcolor((byte)1,(byte)1,(byte)1);
		SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, rgbcolor, null);
		assert(sodaBottleLabel.getRgbcolor() == rgbcolor);
	}

	public void testGetDrPepperLogo(){
		System.out.println("Testing SodaBottleLabel::getDrPepperLogo");
		DrPepperLogo drPepperLogo = new DrPepperLogo(1.0);
		SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, null, drPepperLogo);
		assert(sodaBottleLabel.getDrPepperLogo() == drPepperLogo);
	}


	public static void main(String... args){
		SodaBottleLabelTest sodaBottleLabelTest = new SodaBottleLabelTest();
		sodaBottleLabelTest.testGetHeight();
		sodaBottleLabelTest.testGetDrPepperLogo();
		sodaBottleLabelTest.testGetRGBcolor();
		System.out.println("SodaBottleLabelTest complete");
	}
}
