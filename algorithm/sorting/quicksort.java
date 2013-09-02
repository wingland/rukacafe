package com.rukacafe.algorithm.sorting;

public class quicksort {
	private static int count=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//double[] a={-293,390,391,34,445,423,450,213,340,120};
		double[] a={1,2,3,4,5,6,7,8,9,10};
		sort(a,0,a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("count:"+count);
	}

	public static void sort(double[] a, int start, int end) {
		//System.out.println(start+":"+end);
		if(start>=end)return;
		double pivot=a[end];
		int k=start;
		for (int i = start; i <end; i++) {
			count++;
			if ( a[i]<=pivot) {
				double temp=a[i];
				a[i]=a[k];
				a[k++]=temp;
			}
		}
		a[end]=a[k];
		a[k]=pivot;
		sort(a, start, k - 1);
		sort(a, k + 1, end);
	}

}
