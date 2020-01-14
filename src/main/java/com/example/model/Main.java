package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

	private double temp;
	private double felsLike;
	private double tempMin;
	private double tempMax;
	private int pressure;
	private int seaLevel;
	private int groundLevel;
	private int humidity;

//	@JsonCreator
//	public Main(@JsonProperty("temp") double temp, @JsonProperty("feels_like") double felsLike,
//			@JsonProperty("temp_min") double tempMin, @JsonProperty("temp_max") double tempMax,
//			@JsonProperty("pressure") int pressure, @JsonProperty("humidity") int humidity) {
//		super();
//		this.temp = temp;
//		this.felsLike = felsLike;
//		this.tempMin = tempMin;
//		this.tempMax = tempMax;
//		this.pressure = pressure;
//		this.humidity = humidity;
//	}

	@JsonCreator
	public Main(@JsonProperty("temp") double temp, @JsonProperty("feels_like") double felsLike,
			@JsonProperty("temp_min") double tempMin, @JsonProperty("temp_max") double tempMax,
			@JsonProperty("pressure") int pressure, @JsonProperty("sea_level") int seaLevel,
			@JsonProperty("grnd_level") int groundLevel, @JsonProperty("humidity") int humidity) {
		super();
		this.temp = temp;
		this.felsLike = felsLike;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.pressure = pressure;
		this.seaLevel = seaLevel;
		this.groundLevel = groundLevel;
		this.humidity = humidity;
	}

	public double getTemp() {
		return Math.ceil(temp);
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFelsLike() {
		return Math.ceil(felsLike);
	}

	public void setFelsLike(double felsLike) {
		this.felsLike = felsLike;
	}

	public double getTempMin() {
		return Math.ceil(tempMin);
	}

	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}

	public double getTempMax() {
		return Math.ceil(tempMax);
	}

	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(int seaLevel) {
		this.seaLevel = seaLevel;
	}

	public int getGroundLevel() {
		return groundLevel;
	}

	public void setGroundLevel(int groundLevel) {
		this.groundLevel = groundLevel;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
