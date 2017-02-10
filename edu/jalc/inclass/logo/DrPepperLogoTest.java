package edu.jalc.inclass.logo;

public class DrPepperLogoTest {

	public void testGetHeight(){
		System.out.println("Testing DrPepperLogo::getHeight");
		DrPepperLogo drPepperLogo = new DrPepperLogo(2.0);
		assert(DrPepperLogo.getHeight() == 2.0);

	}

	public static void main(String... args){
		DrPepperLogoTest drPepperLogoTest = new DrPepperLogoTest();
		drPepperLogoTest.testGetHeight();
		System.out.println("DrPepperLogoTest completed");
	}
}
