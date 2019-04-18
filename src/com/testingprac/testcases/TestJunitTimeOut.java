/**
 * Depicts the timeout feature.
 */
package com.testingprac.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.testingprac.util.MessageUtil;

/**
 * @author drana
 *
 */
public class TestJunitTimeOut {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage(message);
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
