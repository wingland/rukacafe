package com.rukacafe.acm.topcoder.tc2_25;

import java.util.ArrayList;
public class PolygonTraversal2 {
	private int m=0;
	public int count(int N, int[] points){
		int[] path=new int[N];
		for(int j=0;j<points.length;j++)path[j]=points[j];
		int i=points.length-1;
		ArrayList<Integer> nn=getNext(i,N,points);
		traverse(nn, path, i);
		return m;
	}
	public void traverse(ArrayList<Integer> nn,int[] path,int i){
		for(Integer next:nn){
			int[] mypath=path;
			mypath[++i]=next;
			if (i==path.length-1){
				if(intersectTop(i,path.length,mypath))m++;
			}
			else
			{
				ArrayList<Integer> childs=getNext(i,path.length,mypath);
			if(childs.size()>0){
				traverse(childs,mypath,i);
			}

			}
		}
	}
	public ArrayList<Integer> getNext(int i, int N,int[] points){
		ArrayList<Integer> av=new ArrayList<Integer>();
		for(int j=0;j<i-1;j++){
			System.out.println("check "+points[j]+":"+points[j+1]+" for "+points[i]);
			int large=0; int small=0;
			if (points[j+1]>points[j]) {
				large=points[j+1];
				small=points[j];
			}
			else {
				large=points[j];
				small=points[j+1];
			}
			if(points[i]>small&&points[i]<large)
				{
				for (int k=1;k<=small-1;k++){

					System.out.println("get"+k);
					if (!av.contains(k)&&!findPoint(points,k))av.add(k);
				}
				for (int k=large+1;k<=N;k++){

					System.out.println("get"+k);
					if (!av.contains(k)&&!findPoint(points,k))av.add(k);
				}
				}
			else {
				for (int k=small+1;k<=large-1;k++){

					System.out.println("get"+k);
					if (!av.contains(k)&&!findPoint(points,k))av.add(k);
				}
			}
		}
		return av;
	}
	public Boolean intersectTop(int i, int N,int[] points){
		ArrayList<Integer> av=new ArrayList<Integer>();
		for(int j=1;j<i-1;j++){
			int large=0; int small=0;
			if (points[j+1]>points[j]) {
				large=points[j+1];
				small=points[j];
			}
			else {
				large=points[j];
				small=points[j+1];
			}
			if(points[i]>small&&points[i]<large)
				{
				for (int k=1;k<=small-1;k++){
					if(points[0]==k)return true;
				}
				for (int k=large+1;k<=N;k++){
					if(points[0]==k)return true;
				}
				}
			else {
				for (int k=small+1;k<=large-1;k++){
					if(points[0]==k)return true;
				}
			}
		}
		return false;
	}
	public Boolean findPoint(int[] points,int t){
		for(int i=0;i<points.length;i++){
			if (points[i]==t) return true;
		}
		return false;
	}
}
