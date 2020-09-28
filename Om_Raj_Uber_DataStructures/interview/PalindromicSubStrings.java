package com.wipro.interview;

public class PalindromicSubStrings {
	public static void palindromicSubString(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				boolean flag=checkPalindrome(str.substring(i,j));
				
				if(flag==true){
					if(str.substring(i,j).length()>=3)
						System.out.println(str.substring(i,j));
				}
			}
		}
	}
		
		public static boolean checkPalindrome(String str){
		
			int i=0;
			int j=str.length()-1;
			while(i<j){
				if(str.charAt(i++)!=str.charAt(j--))
					return false;
				
			}
			return true;
		}
	public static void main(String[] args) {
		String str="aabbaacabcadadad";
		palindromicSubString(str);
	}
}
