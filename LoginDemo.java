package edu.collin.cosc2436.imacharia.logmonitor;

public class LoginDemo {

	public static void main(String[] args) {
		
		Monitor m = new Monitor();
		
		m.startSession();
		m.recordEvent(new LoginEvent("Ian", LoginResult.SUCCESS));
        m.recordEvent(new LoginEvent("Alice", LoginResult.SUCCESS));
        m.printReport();

        // Session B
        m.startSession();
        m.recordEvent(new LoginEvent("Ian", LoginResult.FAIL));
        m.recordEvent(new LoginEvent("Alice", LoginResult.FAIL));
        m.printReport();

        // Session C
        m.startSession();
        m.recordEvent(new LoginEvent("Ian", LoginResult.SUCCESS));
        m.recordEvent(new LoginEvent("Alice", LoginResult.FAIL));
        m.recordEvent(new LoginEvent("Ian", LoginResult.FAIL));
        m.printReport();
    }

		
		
		

	}


