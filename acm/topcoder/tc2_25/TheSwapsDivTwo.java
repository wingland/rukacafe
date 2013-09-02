package com.rukacafe.acm.topcoder.tc2_25;

import java.util.Arrays;

public class TheSwapsDivTwo {
	public int find(int[] sequence){
		int l=sequence.length;
		int all=l*(l-1)/2;
		int result=all;
		System.out.println(result);
		Arrays.sort(sequence);
		int k=1;
		int cu=sequence[0];
		for(int i=1;i<l;i++){
			if(cu==sequence[i])k++;
			if(cu!=sequence[i]){
				cu=sequence[i];
				if(k!=1)result=result-k*(k-1)/2;
				k=1;
			}
		}
		if(k!=1){
			result=result-k*(k-1)/2;
		}
		if(result!=all)result=result+1;
		return result;
	}
}
