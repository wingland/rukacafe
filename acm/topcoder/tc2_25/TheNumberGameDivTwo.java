package com.rukacafe.acm.topcoder.tc2_25;

public class TheNumberGameDivTwo {
	public String find(int n) {
		int m = n;
		int divider = 1;
		int order = 0;
		while (m > 2) {
			for (int i = m; i >= 2; i--) {
				boolean prime = true;
				for (int j=2;j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						if(i==m){
							divider = i/j;
							System.out.println(i+":"+divider);
						}
						prime = false;
						break;
					}
				}
				if (prime) {
					/*System.out.println(i);*/
					if (m % (m - i) == 0&&(m-i)!=1){

						System.out.println("It's "+(m-i));

						return order == 0 ? "John" : "Brus";
					}
				}
			}
			m -= divider;
			order=1-order;
			System.out.println("m:"+m+",order:"+order);
		}
		return order == 0 ? "John" : "Brus";
	}

}
