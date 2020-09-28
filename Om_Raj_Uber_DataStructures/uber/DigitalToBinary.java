package com.wipro.uber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalToBinary {
	public static void main(String[] args) {
		String time="23:60:59";
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(time.split(":")));
		
		List<String> l= new ArrayList<String>();
		for(String s:list) {
			int n=Integer.parseInt(s);
			l.add(Integer.toBinaryString(n));
		}
		
		for(int i=0;i<l.size();i++) {
			if(i<l.size()-1) {
				System.out.printf(l.get(i)+" : ");
			}else {
				System.out.printf(l.get(i));
			}
			
		}
	}

}
