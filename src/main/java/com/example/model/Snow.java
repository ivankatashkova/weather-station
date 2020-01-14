package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

	private double h;

	public Snow(@JsonProperty("3h") double h) {
		super();
		this.h = h;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

}
