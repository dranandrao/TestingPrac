/**
 * Depicts the methods execution.
 */
package com.testingprac.testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author drana
 *
 */
public class TestJunitExecutionOfMethods {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class method");
	}
	
	@Before
	public void before(){
		System.out.println("Before method");
	}
	
	@Test
	public void testOne(){
		System.out.println("Test 1 method");
	}
	
	@Test
	public void testTwo(){
		System.out.println("Test 2 method");
	}
	
	@After
	public void afterTest(){
		System.out.println("After test method");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After class method");
	}
	
	@Ignore
	public void ignore(){
		System.out.println("Ignore method");
	}
}
