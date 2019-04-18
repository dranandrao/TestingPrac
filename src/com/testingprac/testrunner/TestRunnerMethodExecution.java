/**
 * 
 */
package com.testingprac.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.testingprac.testcases.TestJunitExecutionOfMethods;

/**
 * @author drana
 *
 */
public class TestRunnerMethodExecution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestJunitExecutionOfMethods.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}

		System.out.println(result.wasSuccessful());
	}

}
