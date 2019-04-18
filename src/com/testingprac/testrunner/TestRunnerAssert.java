/**
 * 
 */
package com.testingprac.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.testingprac.testcases.TestJunitAssertExample;

/**
 * @author drana
 *
 */
public class TestRunnerAssert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestJunitAssertExample.class);
		
		for(Failure failure : result.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		if(result.wasSuccessful()){
			System.out.println("All test report : OK");
		}
	}

}
