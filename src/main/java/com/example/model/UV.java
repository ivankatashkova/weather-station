package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UV {

	private double lat;
	private double lon;
	private String date;
	private double value;

	public UV(@JsonProperty("lat") double lat, @JsonProperty("lon") double lon, @JsonProperty("date") String date,
			@JsonProperty("value") double value) {
		super();
		this.lat = lat;
		this.lon = lon;
		this.date = date;
		this.value = value;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
