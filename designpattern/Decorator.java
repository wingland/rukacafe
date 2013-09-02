package com.rukacafe.designpattern;

public abstract class Decorator extends Beverate {
	public String getString(){
		return "";
	}
	public static String getStaticDesc(){
		return "I am decorator";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
