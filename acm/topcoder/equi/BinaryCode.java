package com.rukacafe.acm.topcoder.equi;

public class BinaryCode{
	public String[] decode(String message){
		String[] result=new String[2];
		char[] messageChar=message.toCharArray();
		result[0]=this.fixedDecode(0,messageChar);
		result[1]=this.fixedDecode(1,messageChar);
		return result;
	}
	public String fixedDecode(int pzero,char[] messageChar){
		int[] decodeNum=new int[messageChar.length+1];
		decodeNum[0]=0;
		for(int i=0;i<messageChar.length;i++){
			if(i==0)decodeNum[i+1]=pzero;
			else {
				decodeNum[i+1]=messageChar[i-1]-'0'-decodeNum[i]-decodeNum[i-1];
				if(decodeNum[i+1]!=0&&decodeNum[i+1]!=1) return "NONE";
				}
		}
		int lastIndex=messageChar.length-1;
		int lastTest=messageChar[lastIndex]-'0';
		if(lastTest==(decodeNum[lastIndex+1]+decodeNum[lastIndex]))	return this.intArrayToStr(decodeNum);
		else return "NONE";
	}
	public String intArrayToStr(int[] intArray){
		String arrayStr="";
		for(int i=1;i<intArray.length;i++){
			arrayStr+=intArray[i];
		}
		return arrayStr;
	}
}
