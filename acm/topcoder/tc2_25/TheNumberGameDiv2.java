package com.rukacafe.acm.topcoder.tc2_25;

public class TheNumberGameDiv2 {
	public int minimumMoves(int A, int B){
		String strA=A+"";
		String strB=B+"";
		String inverseA=inverse(strA);
		int z=strA.indexOf(strB);
		int f=inverseA.indexOf(strB);
		if(z<0&&f<0)return -1;
		if(z==0)return strA.length()-strB.length();
		if(f>=0)return strA.length()-strB.length()+1;
		else return strA.length()-strB.length()+2;
	}
	public String inverse(String a){
		String b="";
		char[] temp=a.toCharArray();
		for(int i=0;i<temp.length;i++){
			b=temp[i]+b;
		}
		return b;
	}

}
