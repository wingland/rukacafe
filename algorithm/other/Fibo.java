package com.rukacafe.algorithm.other;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Luciana
 * Implements four types of Fibonacci Algorithms
 *
 */
public class Fibo {
	private static int Fin;
	private static long Result;
	private static long TimeCost;
	public static double phai=(Math.sqrt(5)+1)/2;
	public static long[][] matrix ={{1,1},{1,0}};
	public static void main(String[] args)
	{
		int done=-1;
		while(done!=1)
		{
			System.out.println("Input the value of n in your Fibonacci problem:");
			Scanner s=new Scanner(System.in);
			Fin=s.nextInt();
			if(Fin<0)
			{
				System.out.println("Input Error,n should be non-negative");
				continue;
			}
			while(done!=0)
			{
				if(chooseAlgorithm())
				{
					System.out.println("Result is:"+Result+",takes "+TimeCost+" milliseconds,Ratio is:"+(double)TimeCost/Result);
				}
				else done=0;

			}
			System.out.println("Recalculate?Y for yes, N for no");
			if(s.next().equalsIgnoreCase("N"))done=1;
			else done=-1;
		}
	}
	public static Boolean chooseAlgorithm()
	{
		System.out.println("Choose the algorithm you wanna use:");
		System.out.println("1. Naive Recurrence");
		System.out.println("2. Bottom Up");
		System.out.println("3. Naive Recursive Squaring");
		System.out.println("4. Math Squaring");
		System.out.println("5. Matrix Recursive Squaring");
		System.out.println("6. Input another parameter");
		Scanner s=new Scanner(System.in);
		int AlgId=s.nextInt();
		switch(AlgId)
		{
		case 1:
		{
			Date startTime=new Date();
			TimeCost=startTime.getTime();
			Result=naiveRec(Fin);
			Date endTime=new Date();
			TimeCost=endTime.getTime()-TimeCost;
			return true;
		}
		case 2:
		{
			Date startTime=new Date();
			TimeCost=startTime.getTime();
			Result=bottomUp(Fin);
			Date endTime=new Date();
			TimeCost=endTime.getTime()-TimeCost;
			return true;

		}
		case 3:
		{
			Date startTime=new Date();
			TimeCost=startTime.getTime();
			Result=naiveRecSqr(Fin);
			Date endTime=new Date();
			TimeCost=endTime.getTime()-TimeCost;
			return true;
		}
		case 4:
		{
			Date startTime=new Date();
			TimeCost=startTime.getTime();
			double re=Math.pow(phai,(double)Fin)/Math.sqrt(5);
			Result=(long) re;
			Date endTime=new Date();
			TimeCost=endTime.getTime()-TimeCost;
			return true;
		}
		case 5:
		{
			Date startTime=new Date();
			TimeCost=startTime.getTime();
			long[][] tempResult=matrixPow(Fin);//����һ������
			Result=tempResult[0][1];
			Date endTime=new Date();
			TimeCost=endTime.getTime()-TimeCost;
			return true;
		}
		case 6:
		{
			return false;
		}
		default:
		{
			System.out.println("Unknow Type!");
			return true;
		}
		}
	}

	/**
	 * Naive Recurrence Algorithm
	 * @param fin: input of the Fibonacci function 
	 * @return
	 */
	private static long naiveRec(int fin) {
		if(fin<=1)return fin;
		return naiveRec(fin-1)+naiveRec(fin-2);
	}
	
	/**
	 * Bottom Up
	 * Calculate F(i) from 0 to n add one by one
	 * @param fin
	 * @return F(fin)
	 */
	private static long bottomUp(int fin) {

		if(fin<=1)return fin;
		long fa=0;
		long fb=1;
		long temp=0;
		int index=2;
		while(index<=fin)
		{
			temp=fb;
			fb=fa+fb;
			fa=temp;
			index++;
		}
		return fb;
	}

	/**
	 * Naive Recursive Squaring
	 * F(n)=[(phai)^fin/sqrt(5)]
	 * @param fin
	 * @return F(fin)
	 */
	private static long naiveRecSqr(int fin) {
		long re=(long)(myPow(phai,fin)/Math.sqrt(5));
		return re;
	}
	/**
	 * Recursive Squaring
	 * {F(n+1),F(n)},{F(n),F{n-1}}={{1,1},{1,0}}^n
	 * @param n
	 * @return matrix with four elements to the power of n
	 */
	private static long[][] matrixPow(int n) {
		if(n==1)return matrix;
		long[][] temp=matrixPow(n/2);
		long[][] m=matrixMultiple(temp,temp);
		if(n%2==0)return m;
		else return matrixMultiple(m,matrix);
	}
	

	/**
	 * Using Recurrence to implement the pow function
	 * @param arg1
	 * @param arg2
	 * @return arg1 to the power of arg2
	 */
	private static double myPow(double arg1, int arg2) {
		if(arg2==1)return arg1;
		else if(arg2%2==0)
		{
			double temp=myPow(arg1,arg2/2);
			return temp*temp;
		}
		else
		{
			double temp=myPow(arg1,arg2/2);
			return temp*temp*arg1;
		}

	}
	/**
	 * Multiple two Matrixes
	 * @param m1:matrix one
	 * @param m2:matrix two
	 * @return products of m1 multiples m2
	 */
	public static long[][] matrixMultiple(long[][] m1,long[][] m2)
	{
		long[][]m3=new long[2][2];
		m3[0][0]=m1[0][0]*m2[0][0]+m1[0][1]*m2[1][0];
		m3[0][1]=m1[0][0]*m2[0][1]+m1[0][1]*m2[1][1];
		m3[1][0]=m1[1][0]*m2[0][0]+m1[1][1]*m2[1][0];
		m3[1][1]=m1[1][0]*m2[0][1]+m1[1][1]*m2[1][1];
		return m3;
	}

}
