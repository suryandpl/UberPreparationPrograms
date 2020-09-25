package com.wipro.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairSum {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 ,0};
		Map<Integer, ArrayList<Integer[]>> map = new HashMap<Integer, ArrayList<Integer[]>>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=a[i]+a[j];
				Integer[] pair= {a[i],a[j]};
				if(map.containsKey(sum)) {
					ArrayList<Integer[]> existList=map.get(sum);
					existList.add(pair);
				}else {
					ArrayList<Integer[]> list= new ArrayList<Integer[]>();
					list.add(pair);
					map.put(sum, list);
				}
				
			}
		}
		
		for(Entry<Integer, ArrayList<Integer[]>> entry:map.entrySet()) {
			ArrayList<Integer[]> list= entry.getValue();
			if(list.size()>1) {
				for(Integer[] pair:list) {
					System.out.printf(Arrays.toString(pair));
				}
			}
			System.out.println();
		}
	}
}
