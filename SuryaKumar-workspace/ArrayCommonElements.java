package com.algorithms;

public class ArrayCommonElements {
	//Solution 1 :  time complexity - O(n^2) & space complexity - O(1)
	static boolean containsCommonItem(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) return true; 
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {5,6,7};
		System.out.println(containsCommonItem(a, b));
	}

}
