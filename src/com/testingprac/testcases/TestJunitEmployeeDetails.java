/**
 * This class depicts the usage of tests in java
 * 
 */
package com.testingprac.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.testingprac.models.EmployeeDetails;
import com.testingprac.util.EmpBusinessLogic;

/**
 * @author drana
 *
 */
public class TestJunitEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employeeDetails = new EmployeeDetails();

	@Test
	public void testCalculateAppriasal() {
		employeeDetails.setAge(26);
		employeeDetails.setName("Anand");
		employeeDetails.setMonthlySalary(40000);

		double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
		Assert.assertEquals(500, appraisal, 0.0);
	}

	@Test
	public void testCalculateYearlySalary() {
		employeeDetails.setAge(26);
		employeeDetails.setName("Anand");
		employeeDetails.setMonthlySalary(40000);

		double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
		Assert.assertEquals(100000, salary, 0.0);
	}
}
