package com.wipro.uber;

public class SourceTargetStrings {
	public static void main(String[] args) {
		String src="abcdef";
		String target="ab";
		
		String revTarget="";
		for(int i=target.length()-1;i>=0;i--) {
			revTarget+=target.charAt(i);
		}
		//System.out.println(revTarget);
		
		if(src.contains(target) && src.contains(revTarget)) {
			System.out.println("Target and reverse of target present in Source.");
		}else {
			System.out.println("Target and reverse of target not present in Source.");
		}
	}
}
