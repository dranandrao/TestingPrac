/**
 * Extends testcase class.
 */
package com.testingprac.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author drana
 *
 */
public class TestJunitExtTestCase extends TestCase {

	protected double fValue1;
	protected double fValue2;

	@Before
	public void setUp() {
		fValue1 = 2.0;
		fValue2 = 3.0;
	}

	@Test
	public void testAdd() {
		System.out.println("No of test cases " + this.countTestCases());

		System.out.println("Test case name " + this.getName());

		this.setName("new Test add");

		System.out.println("Update test case name " + this.getName());
	}

	@After
	public void tearDown(){
		
	}
}
