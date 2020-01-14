package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {

	private int all;

	public Clouds(@JsonProperty("all") int all) {
		super();
		this.all = all;
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

}
