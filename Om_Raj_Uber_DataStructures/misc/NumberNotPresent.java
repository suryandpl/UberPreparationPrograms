package com.wipro.misc;

import java.util.HashSet;

public class NumberNotPresent {
	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {2,3,1,0,5};
		
		HashSet<Integer> h= new HashSet<Integer>();
		for(int i=0;i<b.length;i++) {
			h.add(b[i]);
		}
		for(int i=0;i<a.length;i++) {
			if(!h.contains(a[i])) {
				System.out.println(a[i]);
			}
		}
		
	}

}
