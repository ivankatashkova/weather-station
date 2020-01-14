package com.example.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiveDaysForecastResponseEntitty {

	private String cod;
	private String message;
	private int cnt;
	private List<com.example.model.List> list;
	private City city;
	private String country;
	private int timezone;
	private long sunrise;
	private long sunset;

	public FiveDaysForecastResponseEntitty(@JsonProperty("cod") String cod, @JsonProperty("message") String message,
			@JsonProperty("cnt") int cnt, @JsonProperty("list") List<com.example.model.List> list,
			@JsonProperty("city") City city, @JsonProperty("country") String country,
			@JsonProperty("timezone") int timezone, @JsonProperty("sunrise") long sunrise,
			@JsonProperty("sunset") long sunset) {
		super();
		this.cod = cod;
		this.message = message;
		this.cnt = cnt;
		this.list = list;
		this.city = city;
		this.country = country;
		this.timezone = timezone;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List<com.example.model.List> getList() {
		return list;
	}

	public void setList(List<com.example.model.List> list) {
		this.list = list;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
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
