package com.wipro.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class UniquePairSum {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 1,2,3,4,5,2, 3, 4, 5 ,0};
		Map<Integer, LinkedHashSet<Integer[]>> map = new LinkedHashMap<Integer, LinkedHashSet<Integer[]>>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=a[i]+a[j];
				Integer[] pair= {a[i],a[j]};
				if(map.containsKey(sum)) {
					LinkedHashSet<Integer[]> existList=map.get(sum);
					existList.add(pair);
				}else {
					LinkedHashSet<Integer[]> list= new LinkedHashSet<Integer[]>();
					list.add(pair);
					map.put(sum, list);
				}
				
			}
		}
		
		for(Entry<Integer, LinkedHashSet<Integer[]>> entry:map.entrySet()) {
			LinkedHashSet<Integer[]> list= entry.getValue();
			if(list.size()>1) {
				for(Integer[] pair:list) {
					System.out.printf(Arrays.toString(pair));
				}
			}
			System.out.println();
		}
	}

}
