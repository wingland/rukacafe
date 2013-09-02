package com.rukacafe.algorithm.sorting;

public class bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] a={1,3,4,6,7,9,10,98,110,232,2324};
		sort(a);
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

	public static void sort(double[] a) {
		int count=0;
		 boolean flag= true;  
		for (int j = 0; j < a.length - 1&&flag; j++) {
			flag=false;
			for (int i = 0; i <a.length-1-j; i++) {
				count++;
				if (a[i] > a[i + 1]) {
					double temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
					flag=true;
				}
			}
		}
		System.out.println(count);
	}

}
