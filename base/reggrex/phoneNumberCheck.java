package com.rukacafe.base.reggrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumberCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "021-57893023";
		System.out.println(a + ":" + isPhoneNumber(a));
		Person p = new Person();
		setName(p);
		System.out.println(p.name);
		setNewName(p);
		System.out.println(p.name);
		String astr="great";
		setString(a);
		System.out.println(astr);
	}

	public static void setName(Person p) {
		p.name = "HelloGirl";
	}

	public static void setNewName(Person p) {
		p.name = "HelloMyGirl";
		p = new Person();
		p.name = "Hello New Girl";
	}
	public static void setString(String a){
		a=a+" addme";
	}

	public static boolean isPhoneNumber(String pn) {
		String reg = "\\d{3,4}-[0-9]{7,8}";
		Pattern pt = Pattern.compile(reg);
		Matcher m = pt.matcher(pn);
		if (m.matches()) {
			return true;
		} else
			return false;
	}

}

class Person {
	String name;
	String age;
}
