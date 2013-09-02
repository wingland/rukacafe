package com.rukacafe.designpattern;

public abstract class Beverate {
	private String Desc="test";
	public abstract double cost();
	public String getDescription(){
		return Desc;
	};
	public static String getStaticDesc(){
		return descS;
	}
	public static String descS="I am static description";
}
