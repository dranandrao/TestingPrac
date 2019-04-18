/**
 * This class has a message variable which contains message.
 */
package com.testingprac.util;

/**
 * @author dranandrao
 *
 */
public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}

	public String printMessage() {
		System.out.println(message);
		return message;
	}

	public void printMessage(String message) {
		System.out.println(message);
		while (true)
			;
	}

	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

	public void exceptionMessage() {
		System.out.println(message);
		int a = 0;
		int b = 1 / a;
	}
}
