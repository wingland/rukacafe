package com.rukacafe.acm.topcoder.tc1_14;

import java.util.Arrays;

public class GoldenChain {
	public int mintCuts(int[] sections){
		int linkedSecs=sections.length;
		int linker=0;
		int cut=0;
		Arrays.sort(sections);
		for(int i=0;i<sections.length&&linker<linkedSecs;i++){
			if(linker+sections[i]<=linkedSecs-1){
				linker+=sections[i];
				linkedSecs-=1;
				cut+=sections[i];
				System.out.println("go on,cut section"+i+":"+sections[i]+" for"+cut+",linkedSec:"+linkedSecs+",linker:"+linker);
			}
			else  {
				cut+=linkedSecs-1-linker+1;
				linker+=linkedSecs-1-linker;
				linkedSecs-=1;
				System.out.println("no, cut section"+i+":"+sections[i]+" for"+cut+",linkedSec:"+linkedSecs+",linker:"+linker);
				break;
			}
		}
		if(linker<linkedSecs)return sections.length;
		else return cut;
	}

}
