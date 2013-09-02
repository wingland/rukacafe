package com.rukacafe.acm.topcoder.tc1_21;

public class TheSquareRootDilemma {
	public int countPairs(int N, int M){
		int max=N<M?M:N;
		int min=N<M?N:M;
		int count=0;
		for(int i=1;i<=min;i++){
			for(int j=i;j<=max;j++){
				double value=(i+j+2*Math.sqrt((long)i*(long)j));
				System.out.println(i+":"+j+":"+value);
				if(value-(long)value==0)count++;
			}
		}
		return count;
	}
}
