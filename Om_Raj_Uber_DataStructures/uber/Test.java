package com.wipro.uber;

public class Test {
	public static void main(String[] args) {
		int a[]= new int[] {1,2,3,4,5};
		int b[]=a;
		int l=a.length;
		
//		int i=0,j=1;
//		while(i<l &&j<l) {
//			int sum=a[i]+b[j];
//			i++;
//			j++;
//			
//			System.out.println(a[i]+" "+b[j]);
//		}
		for(int i=0,j=1;i<l;i++) {
			if(j<l-1) {
				
			}
			System.out.println(a[i]+" "+b[j]);
		}
	}

}
