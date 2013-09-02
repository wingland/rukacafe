package com.rukacafe.acm.topcoder.tc1_13;

public class YahtzeeScore{
	public int maxPoints(int[] toss){
		int point=0;
		for(int i=0;i<toss.length;i++){
			int myPoint=0;
			for(int j=0;i<toss.length;j++){
				if(toss[j]==toss[i])point+=toss[j];
			}
			if(myPoint>point)point=myPoint;
		}
		return point;
	}
}