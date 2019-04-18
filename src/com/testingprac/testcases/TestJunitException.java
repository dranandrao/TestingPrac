/**
 * 
 */
package com.testingprac.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.testingprac.util.MessageUtil;

/**
 * @author drana
 *
 */
public class TestJunitException {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}
