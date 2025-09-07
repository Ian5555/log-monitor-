package edu.collin.cosc2436.imacharia.logmonitor;

import java.util.ArrayList;
/**
 * The Monitor class holds login events for a session
 * and makes a report showing all events and simple totals
 */
public class Monitor {
	private ArrayList<LoginEvent> events;
/**
 * Starts a new session by creating a fresh list of login events
 */
	public void startSession() {
		events = new ArrayList<>();
	}
/**
 * Records a new login event into the session
 * @param e the LoginEvent to add
 */
	public void recordEvent(LoginEvent e) {
		events.add(e);
	}
/**
 * Counts how many login events were successful.
 * @return the amount of SUCCESS results
 */
	private int countSuccess() {
		int count = 0;
		for (LoginEvent e : events) {
			if (e.getResult() == LoginResult.SUCCESS) {
				count++;
			}
		}
		return count;
	}
	/**
	 * Counts how many login events failed
	 * @return the number of FAILS
	 */

	private int countFail() {
		int count = 0;
		for (LoginEvent e : events) {
			if (e.getResult() == LoginResult.FAIL) {
				count++;
			}
		}
		return count;
	}
	/**
	 * Prints the report of logins
	 */

	public void printReport() {

		for (LoginEvent e : events) {
			System.out.println("User: " + e.getUsername() + ", Result: " + e.getResult());
		}

		System.out.println("Totals: success=" + countSuccess() + ", fail=" + countFail());
		System.out.println("----------------");

	}
}