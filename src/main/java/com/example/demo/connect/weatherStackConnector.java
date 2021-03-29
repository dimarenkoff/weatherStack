package com.example.demo.connect;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.city;

import model.weatherStackDto;

public class weatherStackConnector {
	private static String baseURL="http://api.weatherstack.com/";
	private static String urlParam="current?access_key=";
	private static String APIKey="9c426f3df13fea535bba98f41d91f298";
	private static String url=baseURL+urlParam+APIKey+"&query=";
	
	public weatherStackDto getWeatherForCity(city mesto) throws URISyntaxException {
		RestTemplate dotaz = new RestTemplate();
		URI link;
		link=null;
		link=new URI(url+mesto);
		//ResponseEntity<String> response=dotaz.getForEntity(link, String.class);
		ResponseEntity<weatherStackDto> response = dotaz.getForEntity(link, weatherStackDto.class);
		return response.getBody();
	}
}
