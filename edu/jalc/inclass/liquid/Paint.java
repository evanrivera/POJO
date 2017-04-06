package edu.jalc.inclass.liquid;

public class Paint {

	private double volume;

	public Paint(){
		this.setVolume(0.0);
	}

	public Paint(double volume){
		this.setVolume(volume);
	}

	public double getVolume(){ return this.volume; }

	public Paint setVolume(double volume){
		this.volume = volume;
		return this;
	}
}
