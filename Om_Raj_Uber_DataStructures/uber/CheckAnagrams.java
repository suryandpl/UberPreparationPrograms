package com.wipro.uber;

import java.util.Arrays;

public class CheckAnagrams {
	public static void main(String[] args) {
		String s1 = "Fried".toLowerCase();
		String s2 = "fired".toLowerCase();

		boolean flag = checkAnagram(s1, s2);
		System.out.println(flag);

	}

	private static boolean checkAnagram(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 != l2)
			return false;

		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}

		}

		return true;
	}

}
