/**
 * Basic test case class which compares whether the messages are equal.
 */
package com.testingprac.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.testingprac.util.MessageUtil;

/**
 * @author dranandrao
 *
 */
public class TestJunit {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		//message = "New World";
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
