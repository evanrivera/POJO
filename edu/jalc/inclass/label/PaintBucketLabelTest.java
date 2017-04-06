package edu.jalc.inclass.label;

import edu.jalc.inclass.color.RGBColor;
import edu.jalc.inclass.label.PaintBucketLabel;

public class PaintBucketLabelTest {

	public void testGetHeight(){
		System.out.println("Testing PaintBucketLabel::getHeight");
		PaintBucketLabel paintBucketLabel = new PaintBucketLabel(1.0, null, null);
		assert(paintBucketLabel.getHeight() == 1.0);
	}

	public void testGetRGBColor(){
		System.out.println("Testing PaintBucketLabel::getRGBColor");
		RGBColor rgbcolor = new RGBColor((byte)1,(byte)1,(byte)1);
		PaintBucketLabel paintBucketLabel = new PaintBucketLabel(1.0, rgbcolor, null);
		assert(paintBucketLabel.getRGBColor() == rgbcolor);
	}

	public void testGetPaintBucketLabel(){
		System.out.println("Testing PaintBucketLabel::getPaintBucketLabel");
		PaintBucketLabel paintBucketLabel = new PaintBucketLabel(1.0);
		PaintBucketLabel paintBucketLabel = new PaintBucketLabel(1.0, null, paintBucketLabel);
		assert(paintBucketLabel.getPaintBucketLabel() == paintBucketLabel);
	}


	public static void main(String... args){
		PaintBucketLabelTest paintBucketLabelTest = new PaintBucketLabelTest();
		paintBucketLabelTest.testGetHeight();
		paintBucketLabelTest.testGetPaintBucketLabel();
		paintBucketLabelTest.testGetRGBColor();
		System.out.println("PaintBucketLabelTest complete");
	}
}
