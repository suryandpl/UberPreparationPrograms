package com.test;

import java.util.ArrayList;
import java.util.List;

public class DigitalToBinaryWatch {
	public static List<String> readBinaryWatch(int num){
		List<String> result = new ArrayList<String>();
		//hours 0-11 and minutes are 0-59 
		for(int h=0;h<12;h++) {
			for(int m=0;m<60;m++) {
				if(Integer.bitCount(h)+Integer.bitCount(m)==num) {
					result.add(String.format("%d:%02d",h,m));
				}
			}
		}
		return result;
	}
	public static List<String> readBinaryWatch1(int num){
		List<String> result = new ArrayList<String>();
		//hours 0-11 and minutes are 0-59 
		for(int h=0;h<12;h++) {
			for(int m=0;m<60;m++) {
				if(Integer.bitCount(h)+Integer.bitCount(m)==num) {
					String str = "" + h + ":";
	                  if(m<10) str+= "0";
	                  str+= ""+m;
	                  result.add(str);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> result = readBinaryWatch(1);
		//System.out.println(result);
		List<String> result1 = readBinaryWatch1(0);
		System.out.println(result1);
	}

}
