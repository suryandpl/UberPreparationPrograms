package com.wipro.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Anagrams {
	
	public static void findAnagrams(ArrayList<String> list){
		HashSet<String> l= new HashSet<String>();
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				boolean flag=checkAnagrams(list.get(i).toLowerCase(),list.get(j).toLowerCase());
				if(flag==true) {
					System.out.println(list.get(i)+" "+list.get(j));
					
					l.add(list.get(i));
					l.add(list.get(j));

				}
			}
		}
		list.removeAll(l);
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
	public static boolean checkAnagrams(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str[]= {"Fried", "Gainly" ,"fired", "dreads" ,"laying", "Sadder" ,"god", "goat"};
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(str));
		//System.out.println(list);
		findAnagrams(list);
		
	}
}
