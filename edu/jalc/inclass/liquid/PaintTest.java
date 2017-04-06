package edu.jalc.inclass.liquid;

public class PaintTest {

	public void testSetVolume(){
		System.out.println("Testing Paint::setVolume");
		Paint paint = new Paint();
		paint.setVolume(4.0);
		assert(paint.getVolume() == 4.0);
	}

	public static void main(String... args){

		PaintTest paintTest = new PaintTest();
		paintTest.testSetVolume();
		System.out.println("Paint Tests Complete");
	}
}
