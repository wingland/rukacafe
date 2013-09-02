package com.rukacafe.acm.topcoder.equi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortByOdds{
	public String[] sortByOddd(String[] rules){
		List<Lottery> lotList=new ArrayList<Lottery>();
		String[] result=new String[rules.length];
		for(int i=0;i<rules.length;i++){
			lotList.add(parseRules(rules[i]));
		}
		 Collections.sort(lotList,LOTTERY_ORDER);
		 for(int i=0;i<lotList.size();i++){
			 result[i]=lotList.get(i).name+lotList.get(i).calCombos();
		 }
		 return result;
	}
	final Comparator<Lottery> LOTTERY_ORDER=new Comparator<Lottery>(){
		public int compare(Lottery l1,Lottery l2){
			return l2.compareTo(l1);
		}
	};
	public Lottery parseRules(String rule){
		String[] parseList=rule.split(":");
		String[] ruleParam=parseList[1].split(" ");
		int choice=Integer.parseInt(ruleParam[1]);
		int blank=Integer.parseInt(ruleParam[2]);
		boolean sorted=this.transBool(ruleParam[3]);
		boolean unique=this.transBool(ruleParam[4]);
		return new Lottery(parseList[0],choice,blank,sorted,unique);
	}
	public boolean transBool(String boolStr){
		if(boolStr.equals("T"))return true;
		else return false;
	}
	public class Lottery implements Comparable<Lottery>{
		public String name;
		public int choices;
		public int blanks;
		public boolean sorted;
		public boolean unique;
		public Lottery(String _name,int _choices,int _blanks,boolean _sorted,boolean _unique){
			this.name=_name;
			this.choices=_choices;
			this.blanks=_blanks;
			this.sorted=_sorted;
			this.unique=_unique;
		}
		public long calCombos(){
			//TODO:
			if(!this.sorted&&!this.unique){
				return (long)Math.pow(this.choices,this.blanks);
			}
			else if(!this.sorted&&this.unique){
				return this.permutation(this.choices,this.blanks);
			}
			else if(this.sorted&&!this.unique){
				return this.sortCombs(this.choices,this.blanks);
			}
			else{
				return this.combination(this.choices,this.blanks);
			}
		}

		public long permutation(int range,int select){
			int start=range-select+1;
			long result=1;
			for(int i=start;i<=range;i++){
				result*=i;
			}
			return result;
		}
		public long combination(int range,int select){
			int start=range-select+1;
			long result=1;
			for(int i=start;i<=range;i++){
				result*=i;
			}
			for(int i=select;i>=1;i--){
				result=result/i;
			}
			return result;
		}
	/*	public long sortCombs(int range,int select){
			if(range==1)return 1;
			if(select==1)return select;
			long result=0;
			for(int i=0;i<range;i++){
				result+=sortCombs(i,select-1);
			}
			return result;
		}*/
		public long sortCombs(int range,int select){
			long result=0;
			for(int i=1;i<=select;i++){
				result+=this.combination(range, i)*this.combination(select-1, i-1);
			}
			return result;
		}
		@Override
		public int compareTo(Lottery o) {
			// TODO Auto-generated method stub
			if(this.calCombos()>o.calCombos())return -1;
			else if(this.calCombos()<o.calCombos())return 1;
			else return -1*this.name.compareTo(o.name);
		}
	}
}