/**
 * Runner class which performs testing of the business logic.
 */
package com.testingprac.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.testingprac.testcases.TestJuintExtTestRes;
import com.testingprac.testcases.TestJunit;
import com.testingprac.testcases.TestJunitAssertExample;
import com.testingprac.testcases.TestJunitExtTestCase;

/**
 * @author dranandrao
 *
 */
public class TestRunner {

	public static void main(String[]args){
		Result result = JUnitCore.runClasses(TestJunit.class);
		Result resultTestJunitAssertFunctions = JUnitCore.runClasses(TestJunitAssertExample.class);
		Result resultExtTestCase = JUnitCore.runClasses(TestJunitExtTestCase.class);
		Result resultExtTestRes = JUnitCore.runClasses(TestJuintExtTestRes.class);
		
		//sample example.
		for(Failure failure : result.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		//assert function loop
		for(Failure failure : resultTestJunitAssertFunctions.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		//Testcase ext loop
		for(Failure failure : resultExtTestCase.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		//Testres ext loop
		for(Failure failure:resultExtTestRes.getFailures()){
			System.out.println(failure.getMessage());
		}
		
		System.out.println(resultExtTestRes.wasSuccessful());
		System.out.println(result.wasSuccessful());
		System.out.println(resultTestJunitAssertFunctions.wasSuccessful());
		System.out.println(resultExtTestCase.wasSuccessful());
	}
}
