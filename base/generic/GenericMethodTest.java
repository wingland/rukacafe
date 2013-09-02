package com.rukacafe.base.generic;

public class GenericMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println(d.fun("hello world"));
	}

}
class Demo{
	public<T> T fun(T var){
		return var;
	}
}
