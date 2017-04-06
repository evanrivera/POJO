package edu.jalc.inclass.bucket;

import edu.jalc.inclass.label.PaintBucketLabel;
import edu.jalc.inclass.lid.PaintBucketLid;
import edu.jalc.inclass.liquid.Paint;

public class PaintBucketTest {

	public void testGetCapacity() throws Exception {
		System.out.println("Testing PaintBucket::getCapacity");
		PaintBucket paintBucket = new PaintBucket(20.0, new PaintBucketCover(1,1), null, null);
		assert(sodaBottle.getCapacity() == 20.0);
	}

	public void testSetCover() throws Exception {
		System.out.println("Testing PaintBucket::setCover");
		PaintBucket paintBucket = new PaintBucket(20.0, new PaintBucketCover(2,3), null, null);
		PaintBucketCover cover = new PaintBucketCover(1,1);
		paintBucket.setCover(cover);
		assert(cover == paintBucket.getCover());
	}

	public void testSetCoverWithException() throws Exception {
		System.out.println("Testing PaintBucket::setCover for exception");
		boolean exceptionThrown = false;
		try {
			new PaintBucket(20.0, null, null, null);
		} catch (Exception e){
			exceptionThrown = true;
		}

		assert(exceptionThrown);
	}

	public void testGetPaint() throws Exception {
		System.out.println("Testing PaintBucket.getPaint");
		Paint paint = new Paint(1.0);
		PaintBucket paintBucket = new PaintBucket(1.0, new PaintBucketCover(1,1), paint, null);
		assert(paint == paintBucket.getPaint());
	}

	public void testGetLabel() throws Exception {
		System.out.println("Testing PaintBucket::getLabel");
		PaintBucketLabel paintBucketLabel = new PaintBucketLabel(1.0, null, null);
		PaintBucket paintBucket = new PaintBucket(1.0, new PaintBucketCover(1,1), null, paintBucketLabel);
		assert(paintBucketLabel == paintBucket.getLabel());
	}

	public static void main(String... args) throws Exception {
		PaintBucketTest paintBucketTest = new PaintBucketTest();
		paintBucketTest.testGetCapacity();
		paintBucketTest.testSetCover();
		paintBucketTest.testSetCoverWithException();
		paintBucketTest.testGetPaint();
		paintBucketTest.testGetLabel();

		System.out.println("All PaintBucket Tests passed");
	}
}
