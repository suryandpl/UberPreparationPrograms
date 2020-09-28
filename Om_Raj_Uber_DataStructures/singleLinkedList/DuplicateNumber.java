package com.wipro.singleLinkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateNumber {
	public static void main(String[] args) {
		int a[]=new int[] {2,4,7,8,9,2,4,7};
		int n=a.length;
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			Integer count=map.get(a[i]);
			if(count==null) {
				map.put(a[i],1);
			}else {
				map.put(a[i],count+1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer k = entry.getKey();
			Integer v = entry.getValue();
			if(v>1) {
				System.out.println("Key: " + k + ", Value: " + v);
			}
			
		}
		
		//System.out.println(map);
		
	}

}
