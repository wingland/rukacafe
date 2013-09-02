package com.rukacafe.acm.topcoder.tc1_29;

public class TheSimilarNumbers{
	public int find(int lower,int upper){
		int i=lower;
		int count=0;
		while(i<=upper){
			count++;
			i=i*10+1;
		}
		return count;
	}
}