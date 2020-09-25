package com.wipro.uber;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicateCharacter {
	public static void main(String[] args) {
		String s="Find first duplicate character in the string.";
		int l=s.length();
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for(int i=0;i<l;i++) {
			if(map.containsKey(s.charAt(i))) {
				
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
				break;
			}else {
				map.put(s.charAt(i),1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
				break;
			}
		}
	}

}
