/**
 * This call contains a set of assert functions example.
 */
package com.testingprac.testcases;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dranandrao
 *
 */
public class TestJunitAssertExample {

	@Test
	public void testAdd() {
		
		int num = 5;
		String temp = null;
		String str = "JUint is working fine";

		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "1", "2", "three" };

		Assert.assertEquals(str, "JUint is not working fine");

		Assert.assertFalse(num > 6);

		Assert.assertNotNull(temp);

		// Check that two objects are equal
		Assert.assertEquals(str1, str2);

		// Check that a condition is true
		Assert.assertTrue(val1 < val2);

		// Check that a condition is false
		Assert.assertFalse(val1 > val2);

		// Check that an object isn't null
		Assert.assertNotNull(str1);

		// Check that an object is null
		Assert.assertNull(str3);

		// Check if two object references point to the same object
		Assert.assertSame(str4, str5);

		// Check if two object references not point to the same object
		Assert.assertNotSame(str1, str3);

		// Check whether two arrays are equal to each other.
		Assert.assertArrayEquals(expectedArray, resultArray);

	}
}
