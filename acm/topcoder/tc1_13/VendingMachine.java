package com.rukacafe.acm.topcoder.tc1_13;

public class VendingMachine {
	public int motorUse(String[] prices,String[] purchases){
		Cylinder myCylinder=this.createCylinder(prices);
		myCylinder.init();
		for(int i=0;i<purchases.length;i++){
			String[] p=purchases[i].split(":");
			String[] pGoods=p[0].split(",");
			Purchase currentBuy=new Purchase(Integer.parseInt(pGoods[0]),Integer.parseInt(pGoods[1]),Integer.parseInt(p[1]));
			myCylinder.buyGoods(currentBuy);
			if(myCylinder.motorMove<0)return myCylinder.motorMove;
		}
		myCylinder.init();
		return myCylinder.motorMove;
		
	}
	public class Purchase{
		public int shelf;
		public int column;
		public int time;
		public Purchase(int _shelf,int _column,int _time){
			this.column=_column;
			this.shelf=_shelf;
			this.time=_time;
		}
	}
	public Cylinder createCylinder(String[] priceString){
		int[][] rawPriceGrid=new int[priceString[0].split(" ").length][priceString.length];
		for(int i=0;i<priceString.length;i++){
			String[] s=priceString[i].split(" ");
			for(int j=0;j<s.length;j++){
				rawPriceGrid[j][i]=Integer.parseInt(s[j]);
			}
		}
		return new Cylinder(rawPriceGrid);
	}
	public class Cylinder {
		public int index = 0;
		public int time = 0;
		public int motorMove=0;
		public int[][] priceGrid;

		public Cylinder(int[][] _grid) {
			this.priceGrid = _grid;
		}
		public void buyGoods(Purchase purchase) {
			if(this.priceGrid[purchase.column][purchase.shelf]==0)this.motorMove= -1;
			if(purchase.time>=time+5)this.init();
			System.out.println("Buy good on shelf"+purchase.shelf+",column"+purchase.column);
			this.rotateToColumn(purchase.column);
			this.priceGrid[purchase.column][purchase.shelf]=0;
			this.time=purchase.time;
		}
		public void init(){
			System.out.println("init");
			this.rotateToColumn(this.getExpensive());
		}
		public int getExpensive() {
			int maximum = 0;
			int expColumn = 0;
			for (int i = 0; i < this.priceGrid.length; i++) {
				int sum = 0;
				for (int j = 0; j < this.priceGrid[i].length; j++)
					sum += this.priceGrid[i][j];
				if (sum > maximum) {
					maximum = sum;
					expColumn = i;
				}
			}
			return expColumn;
		}
		public void rotateToColumn(int target){
			if(Math.abs(this.index-target)>this.priceGrid.length/2){
				motorMove+=this.priceGrid.length-Math.abs(this.index-target);
			}
			else motorMove+= Math.abs(this.index-target);
			//test
			System.out.println("move "+motorMove+":from"+index+"to"+target);
			this.index=target;
		}
	}
}
