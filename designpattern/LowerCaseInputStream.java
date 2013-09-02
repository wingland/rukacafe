package com.rukacafe.designpattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read() throws IOException{
		int c=super.read();
		return (c==-1)?c:Character.toLowerCase((char)c);
	}
	@Override
	public int read(byte[]b,int offset,int len)throws IOException{
		int result=super.read(b,offset,len);
		for(int i=offset;i<offset+result;i++){
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	public LowerCaseInputStream clone(){
		LowerCaseInputStream o=null;
		        try
		        {
		        o=(LowerCaseInputStream)super.clone();//Object�е�clone()ʶ�����Ҫ���Ƶ�����һ
		// ������
		        }
		        catch(CloneNotSupportedException e)
		        {
		            System.out.println(e.toString());
		        }
		        return o;
		    }
}
