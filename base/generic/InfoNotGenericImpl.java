package com.rukacafe.base.generic;

public class InfoNotGenericImpl implements IInfo<String> {

	private String var;
	public InfoNotGenericImpl(String var){
		this.var = var;
	}
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}

}
