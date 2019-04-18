/**
 * 
 */
package com.testingprac.testcases;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

/**
 * @author drana
 *
 */
public class TestJuintExtTestRes extends TestResult {
	int num = 5;
	String value = null;

	// add the error
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}

	// add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(this.num, 6);
		Assert.assertNotNull(value);
	}

	// Marks that the test run should stop.
	public synchronized void stop() {
		// stop the test here
	}
}
