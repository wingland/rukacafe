package com.rukacafe.base.generic;

public class Pair<T>{
	private T instanceA;
	private T instanceB;
	public Pair(T _a,T _b){
		this.instanceA=_a;
		this.instanceB=_b;
	}
	public T getA(){
		return instanceA;
	}
	public T getB(){
		return instanceB;
	}
	public void setA(T _a){
		this.instanceA=_a;
	}
	public void setB(T _b){
		this.instanceB=_b;
	}

}
