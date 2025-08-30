package edu.collin.cosc2436.imacharia.logmonitor;

public class LoginDemo {

	public static void main(String[] args) {
		
		User u = new User("Ian");
		
		LoginEvent a1 = new LoginEvent("Ian", false);
		LoginEvent a2 = new LoginEvent("Ian", true);
		
		System.out.println("User: " + u.getUsername());
		System.out.println("LoginEvent: " + a1.getSuccess());
		System.out.println("LoginEvent: " + a2.getSuccess());
		
		

	}

}
