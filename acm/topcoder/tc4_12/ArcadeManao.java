package com.rukacafe.acm.topcoder.tc4_12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArcadeManao {
	private boolean[][] _plats;
	private int L;
	private int H;
	private int mla;
	private TreeNode tree;
	private ArrayList<Integer> path=new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public class dot{
		dot(int _x,int _y){
			this.x=_x;
			this.y=_y;
		}
		int x;
		int y;
	}
	public int shortestLadder(String[] level, int coinRow, int coinColumn) {
		int la = level.length;
		this.H=level.length;
		this.L=level[0].length();
		boolean[][] plats = new boolean[level.length][level[0].length()];
		for (int i = 0; i < level.length; i++) {
			char[] a = level[i].toCharArray();
			for (int j = 0; j < level.length; j++) {
				if (a[j] == 'X')
					plats[i][j] = true;
				else
					plats[i][j] = false;
			}
		}
		this._plats=plats;
		this.tree=new TreeNode(null, new dot(coinRow-1,coinColumn-1));
		searchNext(this.tree);
		return 0;
	}
	ArrayList<dot> searchNext(TreeNode t){
		int s=t.current.x;
		int y=t.current.y;
		while(_plats[y][s]){
			searchVertNext(t);
			s++;
		}
		s=t.current.x;
		while(_plats[y][s]){
			searchVertNext(t);
			s--;
		}
		for(Iterator<TreeNode> it=t.children.iterator();it.hasNext();){
			TreeNode ct=it.next();
			searchNext(ct);
		}
		//search for the dot, add to list
		//search horizontally for the dot ,add to list
		
		return null;
	}
	void searchVertNext(TreeNode t){
		int x=t.current.x;
		int y=t.current.y;
		for(int i=0;i<H;i++){
			if(_plats[i][x]&&i!=y){
				/*if (Math.abs(i-y)>mla)la=-1;
				if(Math.abs(i-y)>la)la=Math.abs(i-y);*/
				t.addchild(new dot(x,i),Math.abs(i-y));
			}
		}
	}
	private class TreeNode{
		TreeNode next;
		TreeNode parent;
		dot current;
		int la;
		ArrayList<TreeNode> children=new ArrayList<TreeNode>();
		public TreeNode(TreeNode _parent,dot d){
			this.parent=_parent;
			current=d;
		}
		public void addchild(TreeNode child){
			if(children.size()!=0)this.children.get(children.size()-1).next=child;
			this.children.add(child);
			child.parent=this;
		}
		public void addchild(dot d,int la){
			TreeNode child=new TreeNode(this, d);
			child.la=la;
			if(children.size()!=0)this.children.get(children.size()-1).next=child;
			this.children.add(child);
		}
	}

}
