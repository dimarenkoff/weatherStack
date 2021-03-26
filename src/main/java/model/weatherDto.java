package model;

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
	public String getTemp_celsius() {
		return temp_celsius;
	}
	public void setTemp_celsius(String temp_celsius) {
		this.temp_celsius = temp_celsius;
	}
	public String getRel_humidity() {
		return rel_humidity;
	}
	public void setRel_humidity(String rel_humidity) {
		this.rel_humidity = rel_humidity;
	}
	public String getWindSpeed_mps() {
		return windSpeed_mps;
	}
	public void setWindSpeed_mps(String windSpeed_mps) {
		this.windSpeed_mps = windSpeed_mps;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	private String location;
	private String timestamp;
	private String temp_celsius;
	private String rel_humidity;
	private String windSpeed_mps;
	private String windDirection;
	private String weatherDescription;
}
