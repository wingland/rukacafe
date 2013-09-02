/**
 * 
 */
package com.rukacafe.acm.topcoder.testcases;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.rukacafe.designpattern.Beverate;
import com.rukacafe.designpattern.Decorator;
import com.rukacafe.designpattern.LowerCaseInputStream;


/**
 * @author Luciana
 *
 */
public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c;
		try{
			LowerCaseInputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("d:\\desktop\\test.txt")));
			LowerCaseInputStream inNew=in.clone();
			while((c=in.read())>=0){
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println(Beverate.descS);
		System.out.println(Decorator.descS);
		System.out.println(Beverate.getStaticDesc());
		System.out.println(Decorator.getStaticDesc());
		// TODO Auto-generated method stub

	}

}
