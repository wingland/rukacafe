package com.rukacafe.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Md5PasswordTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input your password");
		Scanner scanner=new Scanner(System.in);
		String pw=scanner.next();
		String encrypted=md5(pw);
		//System.out.println("Your md5 is:"+md5(md));
		System.out.println("Input your password again");
		String pwAgain=scanner.next();
		if(check(pwAgain,encrypted))System.out.println("Success, your md5 is:"+encrypted);
		else System.out.println("Not consistent with the first input");
		
		
	}
	public static boolean check(String a,String encrypted){
		return md5(a).equals(encrypted);
	}
	public static String md5(String str){
		MessageDigest md=null;
		try{
			md=MessageDigest.getInstance("MD5");
			
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		md.update(str.getBytes());
		StringBuffer sb=new StringBuffer();  
		byte[] bs=md.digest();
		for(int i=0;i<bs.length;i++){
			int v=bs[i]&0xff;
			if(v<16){
				sb.append(0);
			}
			sb.append(Integer.toHexString(v));
		}
		return sb.toString();
	}

}
