package service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.city;
import com.example.demo.connect.weatherStackConnector;

import model.weatherDto;
import model.weatherStackDto;
@Service
public class weatherService {
	 
	 public weatherDto getWeatherForCity(city mesto) throws URISyntaxException {
		
		weatherStackConnector connector=new weatherStackConnector(); 
		weatherDto n1=new weatherDto();
		n1.setLocation(mesto.toString());
		weatherStackDto weatherStackDto = connector.getWeatherForCity(mesto);
		return transformDto(weatherStackDto);

	 }
	 
	 private weatherDto transformDto(weatherStackDto wsDto) {
		  	weatherDto wdto = new weatherDto();
		  	wdto.setLocation(wsDto.getLocation().getName());
		  	wdto.setRel_humidity(wsDto.getCurrent().getHumidity());
		  	wdto.setTemp_celsius(wsDto.getCurrent().getTemperature());
		  	wdto.setTimestamp(wsDto.getCurrent().getObservation_time());
		  	wdto.setWeatherDescription(wsDto.getCurrent().getWeather_descriptions());
		  	wdto.setWindSpeed_mps(wsDto.getCurrent().getWind_speed());
		  	wdto.setWindDirection(wsDto.getCurrent().getWind_dir());
		  	return wdto;
		}
}
