package test;

import java.util.Arrays;

public class Day3_3rd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int[] a={7,10,4,3,20,15};
        int k=3;
        findSmallest(a,k);
	}

	private static void findSmallest(int[] a, int k) {
         Arrays.sort(a);
         System.out.println(k+"th smallest is : "+a[k-1]);
	}

}
