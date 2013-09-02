package com.rukacafe.algorithm.sorting;

public class insertsort {

	private static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] a={-293,390,391,34,445,423,450,213,340,120};
		//double[] a={1,2,3,4,5,6,7,8,9,10};	
		double[] a={10,9,8,7,6,5,4,3,2,1};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("count:"+count);

	}

	private static void sort(double[] a) {
		for(int i=1;i<a.length;i++){
			double temp=a[i];
			int j=i-1;
			for(;j>=0;j--){
				count++;
				if(a[j]<=temp)break;
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		// TODO Auto-generated method stub
	}
	

}
