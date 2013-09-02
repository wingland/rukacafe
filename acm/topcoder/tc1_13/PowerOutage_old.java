package com.rukacafe.acm.topcoder.tc1_13;

import java.util.List;

public class PowerOutage_old {
	public int estimateTimeOut(int[] fromJunction, int[] toJunction,int[] ductLength){
		DuctTree powerDuctTree=this.buildDuctTree(fromJunction,toJunction,ductLength);
		return this.searchPath( powerDuctTree);
		
	}
	private int searchPath(DuctTree powerDuctTree) {
		// TODO Auto-generated method stub
		int pathLength=0;
		pathLength+=powerDuctTree.root.findShortestPath().getSuperLength();
		return 0;
	}
	public DuctTree buildDuctTree(int[] fromJunction,int[] toJunction,int[] ductLength){
		DuctTree ductTree=new DuctTree();
		for(int i=0;i<fromJunction.length;i++){
			if(fromJunction[i]==0&&ductTree.findNode(fromJunction[i])==null)
			ductTree.setRoot(new DuctTreeNode(fromJunction[i]));
			else if(ductTree.findNode(fromJunction[i])!=null){
				DuctTreeNode d=ductTree.findNode(fromJunction[i]);
				d.setChild(toJunction[i],ductLength[i]);
			}
		}
		return ductTree;
	}
	public class DuctTree{
		public DuctTreeNode root;
		public DuctTree(){
		}
		public void setRoot(DuctTreeNode dn){
			this.root=dn;
		}
		public DuctTreeNode findNode(int key){
			return this.root.findNode(key);
		}
	}
	public class DuctTreeNode{
		private int ductId;
		private int toSuperLength;
		private List<DuctTreeNode> childrenNodes;
		public DuctTreeNode(int myId){
			this.ductId=myId;
		};
		public DuctTreeNode(int myId,int superLength){
			this.ductId=myId;
			this.toSuperLength=superLength;
		};
		public DuctTreeNode findNode(int key) {
			// TODO Auto-generated method stub
			for(DuctTreeNode d:this.childrenNodes){
				if(d.getDuctId()==key)return d;
				if(d.findNode(key)!=null)return d.findNode(key);
			}
			return null;
		}
		public void setChild(int childId,int length){
			this.childrenNodes.add(childId,new DuctTreeNode(childId,length));
		}
		public void setChild(DuctTreeNode childNode){
			this.childrenNodes.add(childNode);
		}
		public int getDuctId(){
			return this.ductId;
		}
		public int getSuperLength(){
			return this.toSuperLength;
		}
		public DuctTreeNode findShortestPath(){
			int minpath=0;
			DuctTreeNode shortestChild=null;
			for(DuctTreeNode d:this.childrenNodes){
				if( minpath==0){minpath=d.getSuperLength();shortestChild=d;}
				else if(d.getSuperLength()<minpath){
					minpath=d.getSuperLength();
					shortestChild=d;
				}
			}
			return shortestChild;
		}
	}

}
