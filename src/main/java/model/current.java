package model;

import java.util.List;

public class current extends location {
	 public String observation_time;
	    int weather_code;
	    List<String> weather_icons;
	    int temperature;
	    List<String> weather_descriptions;
	    int wind_speed;
	    int wind_degree;
	    String wind_dir;
	    int pressure;
	    int precip;
	    int humidity;
	    int cloudcover;
	    int feelslike;
	    int uv_index;
	    int visibility;
	    String is_day;
		public String getObservation_time() {
			return observation_time;
		}
		public void setObservation_time(String observation_time) {
			this.observation_time = observation_time;
		}
		public int getWeather_code() {
			return weather_code;
		}
		public void setWeather_code(int weather_code) {
			this.weather_code = weather_code;
		}
		public List<String> getWeather_icons() {
			return weather_icons;
		}
		public void setWeather_icons(List<String> weather_icons) {
			this.weather_icons = weather_icons;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}
		public List<String> getWeather_descriptions() {
			return weather_descriptions;
		}
		public void setWeather_descriptions(List<String> weather_descriptions) {
			this.weather_descriptions = weather_descriptions;
		}
		public int getWind_speed() {
			return wind_speed;
		}
		public void setWind_speed(int wind_speed) {
			this.wind_speed = wind_speed;
		}
		public int getWind_degree() {
			return wind_degree;
		}
		public void setWind_degree(int wind_degree) {
			this.wind_degree = wind_degree;
		}
		public String getWind_dir() {
			return wind_dir;
		}
		public void setWind_dir(String wind_dir) {
			this.wind_dir = wind_dir;
		}
		public int getPressure() {
			return pressure;
		}
		public void setPressure(int pressure) {
			this.pressure = pressure;
		}
		public int getPrecip() {
			return precip;
		}
		public void setPrecip(int precip) {
			this.precip = precip;
		}
		public int getHumidity() {
			return humidity;
		}
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}
		public int getCloudcover() {
			return cloudcover;
		}
		public void setCloudcover(int cloudcover) {
			this.cloudcover = cloudcover;
		}
		public int getFeelslike() {
			return feelslike;
		}
		public void setFeelslike(int feelslike) {
			this.feelslike = feelslike;
		}
		public int getUv_index() {
			return uv_index;
		}
		public void setUv_index(int uv_index) {
			this.uv_index = uv_index;
		}
		public int getVisibility() {
			return visibility;
		}
		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}
		public String getIs_day() {
			return is_day;
		}
		public void setIs_day(String is_day) {
			this.is_day = is_day;
		}
}
