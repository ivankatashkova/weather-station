package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class List {

	private long dt;
	private Main main;
	private java.util.List<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private Snow snow;
	private String dtText;

	public List(@JsonProperty("dt") long dt, @JsonProperty("main") Main main,
			@JsonProperty("weather") java.util.List<Weather> weather, @JsonProperty("clouds") Clouds clouds,
			@JsonProperty("wind") Wind wind, @JsonProperty("snow") Snow snow, @JsonProperty("dt_txt") String dtText) {
		this.dt = dt;
		this.main = main;
		this.weather = weather;
		this.clouds = clouds;
		this.wind = wind;
		this.snow = snow;
		this.dtText = dtText;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public java.util.List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(java.util.List<Weather> weather) {
		this.weather = weather;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Snow getSnow() {
		return snow;
	}

	public void setSnow(Snow snow) {
		this.snow = snow;
	}

	public String getDtText() {
		return dtText;
	}

	public void setDtText(String dtText) {
		this.dtText = dtText;
	}

}
