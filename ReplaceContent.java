package com.rukacafe.intern.scc;
import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ReplaceContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			replaceFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void replaceFile() throws IOException{
		String n1="WebContent/gadget.jsp";
		String n2="WebContent/ibmjs/scc/activeAlertsViewer/i18n/ALL_ALL.xml";
		File gadget=new File(n1);
		File all=new File(n2);
		BufferedReader in=null;
		BufferedWriter out=null;
		File outfile = new File("WebContent/gadget2.jsp"); 
		try {
			 in=new BufferedReader(new InputStreamReader(new FileInputStream(gadget)));
			 out = new BufferedWriter(  
		                new OutputStreamWriter(new FileOutputStream(outfile), "utf-8"));  
			SAXReader reader = new SAXReader();
			Document doc=reader.read(all);
			String line;
			while((line=in.readLine())!=null){
				 StringBuffer sbr = new StringBuffer();  
				Pattern pattern=Pattern.compile("__MSG_[a-zA-Z]*__");
				Matcher matcher=pattern.matcher(line);
				while(matcher.find()){
					String node=clean(matcher.group());
					Node a=doc.selectSingleNode("/messagebundle/msg[@name='"+node+"']");
					if(a!=null){
						String replaceTxt=a.getText();
						System.out.println(node+"->"+replaceTxt);
						  matcher.appendReplacement(sbr, replaceTxt);
					}
				}
				matcher.appendTail(sbr);
				out.write(sbr.toString());
				out.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			in.close();
			out.close();
		}
	}
	
	public static String clean(String a){
		Pattern pattern=Pattern.compile("__MSG_[a-zA-Z]*__");
		Matcher matcher=pattern.matcher(a);
		if(matcher.matches()){
			return a.substring(6,a.length()-2);
		}
		return a;
	}

}
