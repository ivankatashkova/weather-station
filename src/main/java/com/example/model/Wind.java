package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {

	private double speed;
	private int deg;

	@JsonCreator
	public Wind(@JsonProperty("speed") double speed, @JsonProperty("deg") int deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}

}
