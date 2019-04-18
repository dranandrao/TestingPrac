/**
 * 
 */
package com.testingprac.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.testingprac.testcases.TestJunit;
import com.testingprac.testcases.TestJunitAssertExample;
import com.testingprac.testcases.TestJunitExtTestCase;
import com.testingprac.testcases.TestJunitTestSuite;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * @author drana
 *
 */
public class TestRunnerSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite(TestJunit.class, TestJunitAssertExample.class, TestJunitExtTestCase.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());

		System.out.println("***********************************");
		System.out.println("Using testsuite annotations");
		//This example is using testSuite annotations.
		Result testSuiteResult = JUnitCore.runClasses(TestJunitTestSuite.class);
		for(Failure failure : testSuiteResult.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		System.out.println("***********************************");
	}

}
