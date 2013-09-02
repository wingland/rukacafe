package com.rukacafe.acm.topcoder.tc1_13;

import java.util.Arrays;

public class BridgeCrossing {
	public int minTime(int[] times) {
		Arrays.sort(times);
		int total = 0;
		int i;
		for (i = times.length - 1; i >= 3; i -= 2) {
			if( 2*times[1]<=(times[i-1]+times[0]))
			total += times[i] + times[0] + 2 * times[1];
			else total+=times[i]+times[i-1]+2*times[0];
			System.out.println(total);
		}
		if (i == 2) {
			total += times[i] + times[0];
		} 
		total += times[1];
		System.out.println(total);
		return total;
	}
}
