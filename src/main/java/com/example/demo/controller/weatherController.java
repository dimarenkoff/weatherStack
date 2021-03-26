package com.example.demo.controller;

import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.city;
import com.example.demo.connect.weatherStackConnector;

@RestController
public class weatherController {
	@RequestMapping("/weather")	
	String getWeather(){return "Pocasi pro vsechan mesta"; }
	@RequestMapping("/weather/{city}")	
	String getWeatherForCity(@PathVariable String city) throws URISyntaxException{
		city cityEnum=com.example.demo.city.valueOf(city.toUpperCase());

		weatherStackConnector connector=new weatherStackConnector(); return connector.getWeatherForCity(cityEnum);}
}
