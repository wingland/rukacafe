package com.rukacafe.algorithm.sorting;

/**
 * @author Luciana
 * ����Ŀռ临�ӶȵĹ鲢����
 *
 */
public class mergesort1 {

	private static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = { -293, 390, 391, 34, 445, 423, 450, 213, 340, 120 };
		// double[] a={1,2,3,4,5,6,7,8,9,10};
		// double[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(a,0,a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("count:" + count);

	}

	private static void sort(double[] a, int from, int to) {
		// TODO Auto-generated method stub
		if(from==to)return;
		int middle=(from+to)/2;
		sort(a,from,middle);
		sort(a, middle+1, to);
		int i=from;
		int k=middle+1;
		while(i<=middle&&i<=to){
			if(a[i]>a[k]){
				double temp=a[k];
				for(int j=k;j>i;j--){
					count++;
					a[j]=a[j-1];
				}
				a[i]=temp;
				k++;
			}
			i++;
		}
		
	}

}
