package com.rukacafe.acm.topcoder.tc1_29;

import java.util.Arrays;

public class EllysPairs {
	public int getDifference(int[] knowledge){
		Arrays.sort(knowledge);
		int lp=0;
		int sp=2147483647;
		int n=knowledge.length;
		for(int i=0; i<n/2;i++){
			int p=knowledge[i]+knowledge[n-1-i];
			if(p<=sp)sp=p;
			if(p>=lp)lp=p;
		}
		return (lp-sp);
	}
}