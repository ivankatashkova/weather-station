package com.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.CurrentWeatherResponseEntity;
import com.example.model.FiveDaysForecastResponseEntitty;
import com.example.rest.RestClient;

@Controller
public class MainController {
	
	@Autowired
	private RestClient client;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String index(Model model, HttpSession session) throws SQLException, ClassNotFoundException {
		session.setAttribute("city", null);
		return "index";
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String getWeather(Model model, HttpSession session, @RequestParam String city)
			throws SQLException, ClassNotFoundException {
		CurrentWeatherResponseEntity currentWeather = client.getCurrentWeather(city);
		model.addAttribute("city", city);
		model.addAttribute("currentWeather", currentWeather);
		session.setAttribute("city", city);
		return "index";
	}
	
	@RequestMapping(value = { "/more-detailes" }, method = RequestMethod.GET)
	public String getMoreDetailes(Model model, HttpSession session)
			throws SQLException, ClassNotFoundException {
		String city = (String) session.getAttribute("city");
		model.addAttribute("city", city);
		CurrentWeatherResponseEntity currentWeather = client.getCurrentWeather(city);
		model.addAttribute("weather", currentWeather);
		return "more-detailes";
	}
	
	@RequestMapping(value = { "/detailed-forecast" }, method = RequestMethod.GET)
	public String getDetailedForecast(Model model, HttpSession session)
			throws SQLException, ClassNotFoundException {
		String city = (String) session.getAttribute("city");
		model.addAttribute("city", city);
		FiveDaysForecastResponseEntitty forecast = client.getForecast(city);
		model.addAttribute("forecast", forecast);
		return "detailed-forecast";
	}

}
