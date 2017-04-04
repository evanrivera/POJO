package edu.jalc.inclass.bucket;

import edu.jalc.inclass.label.PaintBucketLabel;
import edu.jalc.inclass.cover.PaintBucketCover;
import edu.jalc.inclass.liquid.Paint;

public class PaintBucket {

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

	PaintBucket(double capacity, PaintBucketCover cover, Paint paint, PaintBucketLabel label) throws Exception {
		this.capacity = capacity;
		this.setCover(cover);
		this.setPaint(paint);
		this.label = label;
	}

	double getCapacity(){ return capacity; }
	PaintBucketCover getCover(){	return this.cover; }
	Paint getPaint(){ return this.paint; }
	PaintBucketLabel getLabel(){ return this.label; }

	PaintBucket setCover(PaintBucketCover cover) throws Exception {
		if(cover == null) throw new Exception("PaintBucketCover cannot be null");
		this.cover = cover;
		return this;
	}

	PaintBucket setPaint(Paint paint){
		this.paint = paint;
		return this;
	}
}
