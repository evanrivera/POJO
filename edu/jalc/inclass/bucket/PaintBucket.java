package edu.jalc.inclass.bucket;

import edu.jalc.inclass.label.PaintBucketLabel;
import edu.jalc.inclass.lid.PaintBucketCover;
import edu.jalc.inclass.liquid.Paint;

public class SodaBottle {

	private final double capacity;
	private PaintBucketCover cover;
	private Paint paint;
	private final PaintBucketLabel label;

	private PaintBucket() throws Exception {
		this.capacity = 0;
		this.setCover(null);
		this.paint = null;
		this.label = null;
	}

	PaintBucket(double capacity, PaintBucketCover cover, Paint paint, SodaBottleLabel label) throws Exception {
		this.capacity = capacity;
		this.setLid(lid);
		this.setSoda(soda);
		this.label = label;
	}

	double getCapacity(){ return capacity; }
	SodaBottleLid getLid(){	return this.lid; }
	Soda getSoda(){ return this.soda; }
	SodaBottleLabel getLabel(){ return this.label; }

	SodaBottle setLid(SodaBottleLid lid) throws Exception {
		if(lid == null) throw new Exception("SodaBottleLid cannot be null");
		this.lid = lid;
		return this;
	}

	SodaBottle setSoda(Soda soda){
		this.soda = soda;
		return this;
	}
}
