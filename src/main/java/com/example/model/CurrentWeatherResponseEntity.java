package com.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeatherResponseEntity {

	private Coord coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private long visability;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private Sys sys;
	private long timezone;
	private long id;
	private String name;
	private long cod;

	@JsonCreator
	public CurrentWeatherResponseEntity(@JsonProperty("coord") Coord coord, @JsonProperty("weather") List<Weather> weather,
			@JsonProperty("base") String base, @JsonProperty("main") Main main,
			@JsonProperty("visability") long visability, @JsonProperty("wind") Wind wind,
			@JsonProperty("clouds") Clouds clouds, @JsonProperty("dt") long dt, @JsonProperty("sys") Sys sys,
			@JsonProperty("timezone") long timezone, @JsonProperty("id") long id, @JsonProperty("name") String name,
			@JsonProperty("cod") long cod) {
		super();
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visability = visability;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public long getVisability() {
		return visability;
	}

	public void setVisability(long visability) {
		this.visability = visability;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public long getTimezone() {
		return timezone;
	}

	public void setTimezone(long timezone) {
		this.timezone = timezone;
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

	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

}
