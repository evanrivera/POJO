package edu.jalc.inclass.bucket1;

import edu.jalc.inclass.lid.PaintBucketCover;

public class PaintBucketApp {

	public static void main(String... args) throws Exception {
		PaintBucket paintBucket = new PaintBucket(20, new PaintBucketCover(1, 2));
		System.out.println("Capacity: " + paintBucket.getCapacity());
	}
}
