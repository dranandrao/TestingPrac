/**
 * 
 */
package com.testingprac.testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.testingprac.util.PrimeNumberCheckerUtil;

/**
 * @author drana
 *
 */
@RunWith(Parameterized.class)
public class TestJunitParameter {
	private int inputNumber;
	private boolean expectedResult;
	private PrimeNumberCheckerUtil primeNumberCheckerUtil;

	@Before
	public void beforeClass() {
		primeNumberCheckerUtil = new PrimeNumberCheckerUtil();
	}

	// For parameterized testing, number of arguments to constructor = number of
	// parameters passed.
	public TestJunitParameter(int inputNumber, boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 23, true }, { 21, false } });
	}

	@Test
	public void testPrimeNumber() {
		System.out.println("Parameterized number is " + inputNumber);
		Assert.assertEquals(expectedResult, primeNumberCheckerUtil.validateNumber(inputNumber));
	}
}
