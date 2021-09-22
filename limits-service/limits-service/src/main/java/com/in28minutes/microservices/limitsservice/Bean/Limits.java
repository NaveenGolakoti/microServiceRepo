package com.in28minutes.microservices.limitsservice.Bean;

public class Limits {

	private int minium;
	private int maximum;

	public Limits() {
		
	}

	public Limits(int minium, int maximum) {
		super();
		this.minium = minium;
		this.maximum = maximum;
	}

	public int getMinium() {
		return minium;
	}

	public void setMinium(int minium) {
		this.minium = minium;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
