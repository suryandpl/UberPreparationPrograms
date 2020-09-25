package com.wipro.singleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int a[]=new int[] {2,4,7,8,9};
		int b[]=new int[] {2,4,11,8,15,478};
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> brr= new ArrayList<Integer>();
		for(int i=0;i<a.length-1;i++) {
			arr.add(a[i]);
		}
		for(int i=0;i<b.length-1;i++) {
			brr.add(b[i]);
		}
		
		arr.retainAll(brr);
		System.out.println(arr);
		
	}

}
