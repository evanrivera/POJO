package edu.jalc.inclass.label;


import edu.jalc.inclass.color.RGBColor;
import edu.jalc.inclass.label.PaintBucketLabel;

public class SodaBottleLabel {

	private final double height;
	private final RGBColor rgbcolor;
	private final PaintBucketLabel paintBucketLabel;

	private PaintBucketLabel(){
		this.height = 0;
		this.rgbcolor = null;
		this.paintBucketLabel = null;
	}

	public PaintBucketLabel(double height, RGBColor rgbcolor, PaintBucketLabel paintBucketLabel){
		this.height = height;
		this.rgbcolor = rgbcolor;
		this.paintBucketLabel = paintBucketLabel;
	}

	public double getHeight() {
		return height;
	}

	public RGBColor getRGBColor() {
		return rgbcolor;
	}

	public PaintBucketLabel getPaintBucketLabel() {
		return paintBucketLabel;
	}
}
