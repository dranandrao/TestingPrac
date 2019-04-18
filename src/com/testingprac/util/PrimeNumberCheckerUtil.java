/**
 * checks whether the number is prime.
 */
package com.testingprac.util;

/**
 * @author drana
 *
 */
public class PrimeNumberCheckerUtil {
	public boolean validateNumber(final int primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

}
