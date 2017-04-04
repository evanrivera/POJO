package edu.jalc.inclass.color;

public class RGBColorTest {

	public void testGetRed(){
		System.out.println("Testing RGBColor:getRed");
		RGBColor rgbColor = new RGBColor((byte)1,(byte)1,(byte)1);
		assert(rgbColor.getRed() == (byte)1);
	}

	public void testGetGreen(){
		System.out.println("Testing RGBcolor:getGreen");
		RGBcolor rgbcolor = new RGBcolor((byte)1,(byte)1,(byte)1);
		assert(rgbcolor.getRed() == (byte)1);
	}

	public void testGetBlue(){
		System.out.println("Testing RGBcolor:getBlue");
		RGBcolor rgbcolor = new RGBcolor((byte)1,(byte)1,(byte)1);
		assert(rgbcolor.getRed() == (byte)1);
	}

	public static void main(String... args){
		RGBcolortest rgbcolortest = new RGBcolortest();
		rgbcolortest.testGetRed();
		rgbcolortest.testGetGreen();
		rgbcolortest.testGetBlue();

		System.out.println("RGBcolortest Completed");
	}
}
