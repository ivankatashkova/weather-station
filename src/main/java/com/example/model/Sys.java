package com.example.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys {

	private int type;
	private long id;
	private String country;
	private long sunrise;
	private long sunset;

	@JsonCreator
	public Sys(@JsonProperty("type") int type, @JsonProperty("id") long id, @JsonProperty("country") String country,
			@JsonProperty("sunrise") long sunrise, @JsonProperty("sunset") long sunset) {
		super();
		this.type = type;
		this.id = id;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getSunrise() {
		return new Date((long)sunrise*1000);
	}

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public Date getSunset() {
		return new Date((long)sunset*1000);
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

}
