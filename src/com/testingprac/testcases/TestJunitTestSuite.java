/**
 * This class uses annotations to make tests.
 */
package com.testingprac.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author drana
 *
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({ TestJunit.class, TestJunitEmployeeDetails.class })
public class TestJunitTestSuite {

}
