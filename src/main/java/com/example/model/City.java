package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

	private long id;
	private String name;
	private Coord coord;

	public City(@JsonProperty("id") long id, @JsonProperty("name") String name, @JsonProperty("coord") Coord coord) {
		this.id = id;
		this.name = name;
		this.coord = coord;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

}
