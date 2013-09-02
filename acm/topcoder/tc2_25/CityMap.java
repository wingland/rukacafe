package com.rukacafe.acm.topcoder.tc2_25;

public class CityMap {
	public String getLegend(String[] cityMap, int[] POIs){
		int[] nums=new int[26];
		for(int i=0;i<26;nums[i++]=0);
		for(int i=0;i<cityMap.length;i++){
			char[] temp=cityMap[i].toCharArray();
			for(int j=0;j<temp.length;j++){
				if (temp[j]!='.')nums[temp[j]-'A']+=1;
			}
		}
		String legend="";
		for(int i=0;i<POIs.length;i++){

			for(int j=0;j<26;j++){
				if(POIs[i]==nums[j])legend+=(char)('A'+j);
			}
		}
		
		return legend;
	}

}
