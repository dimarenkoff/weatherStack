package model;

import java.util.List;

public class weatherDto {
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getTemp_celsius() {
		return temp_celsius;
	}
	public void setTemp_celsius(int i) {
		this.temp_celsius = i;
	}
	public int getRel_humidity() {
		return rel_humidity;
	}
	public void setRel_humidity(int i) {
		this.rel_humidity = i;
	}
	public int getWindSpeed_mps() {
		return windSpeed_mps;
	}
	public void setWindSpeed_mps(int i) {
		this.windSpeed_mps = i;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public List<String> getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(List<String> list) {
		this.weatherDescription = list;
	}
	private String location;
	private String timestamp;
	private int temp_celsius;
	private int rel_humidity;
	private int windSpeed_mps;
	private String windDirection;
	private List<String> weatherDescription;
}
