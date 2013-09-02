package com.rukacafe.base.generic;

public class TestPair {
	public static void main(String[] args){
		String a="hello";
		String b="world";
		Pair<String> pair=new Pair<String>(a,b);
		System.out.println(pair.getA()+pair.getB());
	}
}
