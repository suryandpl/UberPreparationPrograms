package com.wipro.uber;

public class MissingNumbers {
	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		
		int[]missing=new int[input.length];
		for(int i:input) {
			missing[i]=1;
		}
		for(int i=1;i<missing.length;i++) {
			if(missing[i]==0) {
				System.out.println(i);
			}
		}
		
	}

}
