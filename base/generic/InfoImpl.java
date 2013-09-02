package com.rukacafe.base.generic;

public class InfoImpl<T> implements IInfo<T> {

	private T var;

	public InfoImpl(T var){
		this.var = var;
	}
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}

}
