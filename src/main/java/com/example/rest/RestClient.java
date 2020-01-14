package com.example.rest;

import java.text.MessageFormat;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.CurrentWeatherResponseEntity;
import com.example.model.FiveDaysForecastResponseEntitty;

@Component
public class RestClient {
	private static final String CURRENT_WEATHER_BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q={0}";
	private static final String FORECAST_BASE_URL = "http://api.openweathermap.org/data/2.5/forecast?q={0}";
	private static final String APP_ID = "&appid=c2a918b880e6103068b457fce7ab057e";
	private static final String METRICS = "&units=metric";

	private RestTemplate restTemplate = new RestTemplate();

	public CurrentWeatherResponseEntity getCurrentWeather(String city) {
		String url = buildURL(CURRENT_WEATHER_BASE_URL, city);
		ResponseEntity<CurrentWeatherResponseEntity> entity = restTemplate.getForEntity(url, CurrentWeatherResponseEntity.class);
		return entity.getBody();
	}
	
	public FiveDaysForecastResponseEntitty getForecast(String city) {
		String url = buildURL(FORECAST_BASE_URL, city);
		ResponseEntity<FiveDaysForecastResponseEntitty> entity = restTemplate.getForEntity(url, FiveDaysForecastResponseEntitty.class);
		System.out.println(entity);
		return entity.getBody();
	}

	private String buildURL(String baseUrl,String city) {
		String url = MessageFormat.format(baseUrl, city) + APP_ID + METRICS;
		return url;
	}

}
