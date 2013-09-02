package com.rukacafe.acm.topcoder.tc4_12;

public class TheExperimentDiv2 {

	/**
	 * @param args
	 */
	public int[] determineHumidity(int[] intensity, int L, int[] leftEnd){
		int[] result=new int[leftEnd.length];
		boolean[] flag=new boolean[intensity.length];
		for(int i=0;i<leftEnd.length;i++){
			int a=0;
			for(int j=leftEnd[i];j<leftEnd[i]+L;j++){
				if(!flag[j]){
					a+=intensity[j];
					result[i]=a;
					flag[j]=true;
				}
			}
		}
		return result;
	}

}
