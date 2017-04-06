package edu.jalc.inclass.color;

public class RGBColorTest {

	public void testGetRed(){
		System.out.println("Testing RGBColor:getRed");
		RGBColor rgbColor = new RGBColor((byte)1,(byte)1,(byte)1);
		assert(rgbColor.getRed() == (byte)1);
	}

	public void testGetGreen(){
		System.out.println("Testing RGBColor:getGreen");
		RGBcolor rgbColor = new RGBcolor((byte)1,(byte)1,(byte)1);
		assert(rgbColor.getRed() == (byte)1);
	}

	public void testGetBlue(){
		System.out.println("Testing RGBColor:getBlue");
		RGBcolor rgbColor = new RGBcolor((byte)1,(byte)1,(byte)1);
		assert(rgbColor.getRed() == (byte)1);
	}

	public static void main(String... args){
		RGBColorTest rgbcolortest = new RGBColorTest();
		rgbcolortest.testGetRed();
		rgbcolortest.testGetGreen();
		rgbcolortest.testGetBlue();

		System.out.println("RGBColorTest Completed");
	}
}
