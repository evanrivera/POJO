package edu.jalc.inclass.cover;

public class PaintBucketCover {

	private boolean attached;
	private final double height;
	private final double radius;

	private PaintBucketCover(){
		this.attached = false;
		this.height = this.radius = 0;
	}

	public PaintBucketCover(double height, double radius){
		this.height = height;
		this.radius = radius;
		this.attached = false;
	}

	public double getHeight(){ return this.height; }
	public double getRadius(){ return this.radius; }
	public boolean isAttached(){ return this.attached; }

	public PaintBucketCover attach(){
		this.setAttached(true);
		return this;
	}

	public PaintBucketCover detach(){
		this.setAttached(false);
		return this;
	}

	private void setAttached(boolean attached){
		this.attached = attached;
	}

}
