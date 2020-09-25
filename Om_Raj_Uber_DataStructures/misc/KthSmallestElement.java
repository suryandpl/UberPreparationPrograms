package com.wipro.misc;

import java.util.Arrays;

public class KthSmallestElement {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 7, 10, 4, 3, 20, 15 }; 
        int k = 3; 
        Arrays.sort(arr); 
        System.out.println(arr[k - 1]);
	}

}
