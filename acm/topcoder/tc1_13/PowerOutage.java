package com.rukacafe.acm.topcoder.tc1_13;
public class PowerOutage {
	public int estimateTimeOut(int[] fromJunction, int[] toJunction,int[] ductLength){
		int totalPathLength=0;
		for(int i=0;i<ductLength.length;i++){
			totalPathLength+=ductLength[i];
		}
		String a="3";
		char b='3';
		Integer c=2;
		return totalPathLength*2-
				this.findDepth(fromJunction, toJunction, ductLength, 0, 0);
	}
	public int findDepth(int[] fj, int[] tj,int[] dl,int currentNode,int depth){
		int mydepth=depth;
		for(int i=0;i<fj.length;i++){
			if(fj[i]==currentNode){
				int currentdepth=dl[i]+findDepth(fj,tj,dl,tj[i],depth);
				if(mydepth==depth||mydepth<currentdepth)mydepth=currentdepth;
			}
		}
		return mydepth;
	}
}
