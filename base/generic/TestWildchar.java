package com.rukacafe.base.generic;

public class TestWildchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info<Integer> info1 = new Info<Integer>();   
		Info<Float> info2 = new Info<Float>();   
		Info<String> info3 = new Info<String>();   //定义泛型类型为String   
		info1.setVar(23);
		info2.setVar(50.0f);
		info3.setVar("helloworld");
		printInfo(info3);
		extendprintInfo(info1);
		superprintInfo(info1);
		extendprintInfo(info2);
		//superprintInfo(info2);
		//extendprintInfo(info3);
	}
	public static void printInfo(Info<?> a){
		System.out.println(a.getVar());
	}
	public static void extendprintInfo(Info<? extends Number> a){
		System.out.println(a.getVar());
	}
	public static void superprintInfo(Info<? super Integer> a){
		System.out.println(a.getVar());
	}
}
