/**
 * This class depicts the annotations execution.
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
public class TestJunitAnnotation {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class method");
	}
	
	@Before
	public void before(){
		System.out.println("Before method");
	}
	
	@Test
	public void test(){
		System.out.println("Test method");
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
