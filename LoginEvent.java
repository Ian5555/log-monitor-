package edu.collin.cosc2436.imacharia.logmonitor;

public class LoginEvent {
	private String username;
	private boolean success;
	
	public LoginEvent(String username, boolean success) {
		this.username = username;
		this.success = success;
	}
	
	public String getUsername() {
		return username;
	}
	public boolean getSuccess() {
		return success;
	}

}
