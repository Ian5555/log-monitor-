package edu.collin.cosc2436.imacharia.logmonitor;
/**
 * The LoginEvent class represents a single login attempt 
 * with a username and result 
 */
public class LoginEvent {
	private String username;
	private LoginResult result;
/**
 * Constructs a new LoginEvent with the username and result
 * @param username the name of the user logging in
 * @param result the result of the login
 */
	public LoginEvent(String username, LoginResult result) {
		this.username = username;
		this.result = result;

	}
	/**
	 * Returns the username of this loginevent
	 * @return the username
	 */

	public String getUsername() {
		return username;
	}
	/**
	 * Returns the result of the login
	 * @return the result SUCCESS or FAIL
	 */

	LoginResult getResult() {
		return result;
	}

}
