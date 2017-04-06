package edu.jalc.inclass.cover;

public class PaintBucketCoverTest {

	public void testGetHeight(){
		System.out.println("Testing PaintBucketCover::getHeight");
		PaintBucketCover cover = new PaintBucketCover(1.5,2.5);
		assert(1.5 == cover.getHeight());
	}

	public void testGetRadius(){
		System.out.println("Testing PaintBucketCover::getRadius");
		PaintBucketCover cover = new PaintBucketCover(1.4, 2.3);
		assert(2.3 == cover.getRadius());
	}

	public void testAttach(){
		System.out.println("Testing PaintBucketCover::attach");
		PaintBucketCover cover = new PaintBucketCover(1,1);
		cover.attach();
		assert(cover.isAttached());
	}

	public void testDetach(){
		System.out.println("Testing PaintBucketCover::detach");
		PaintBucketCover cover = new PaintBucketCover(1,1);
		cover.detach();
		assert(!cover.isAttached());
	}

	public static void main(String... args) throws Exception {
		PaintBucketCoverTest test = new PaintBucketCoverTest();
		test.testGetHeight();
		test.testGetRadius();
		test.testAttach();
		test.testDetach();

		System.out.println("All PaintBucketCover Tests passed");
	}
}
