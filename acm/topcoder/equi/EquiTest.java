package com.rukacafe.acm.topcoder.equi;

public class EquiTest {

	/**
	 * @param args
	 */
	public static int  equi(int[] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		int lowerSum = 0;
		int higherSum = sum;
		for (int p = 0; p < A.length; p++) {
			higherSum -= A[p];
			if (lowerSum == higherSum)
				return p;
			lowerSum += A[p];
		}
		return -1;
	}
}
