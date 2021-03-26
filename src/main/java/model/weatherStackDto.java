package model;

public class weatherStackDto {
	public request getRequest() {
		return Request;
	}
	public void setRequest(request request) {
		Request = request;
	}
	public location getLocation() {
		return Location;
	}
	public void setLocation(location location) {
		Location = location;
	}
	public current getCurrent() {
		return Current;
	}
	public void setCurrent(current current) {
		Current = current;
	}
	public request Request;
	public location Location;
	public current Current;
	
	
	
	
	
}
