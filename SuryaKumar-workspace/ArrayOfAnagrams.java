package com.test;
;
//Give an array of anagrams [“Fried”, “Gainly” ,”fired”, “dreads” ,”laying”, “Sadder” ,”god”, “goat”]
public class ArrayOfAnagrams {

	public static void printAnagrams(String[] sArr) {
		for(int i =0;i<sArr.length;i++) {
			for(int j =i+1;j<sArr.length;j++) {
				boolean isAnagram = findAnagram(sArr[i].toLowerCase(),sArr[j].toLowerCase());
				if(isAnagram) {
					System.out.println(sArr[i]+","+sArr[j]);
				}
			}
		}
	}
	public static boolean findAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		int[] count = new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int j=0;j<count.length-1;j++) {
			if(count[j]!=0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generatated method stub
		String[] sArr = {"Fried", "Gainly" ,"fired", "dreads" ,"laying", "Sadder" ,"god", "goat"};
		printAnagrams(sArr);
	}

}
