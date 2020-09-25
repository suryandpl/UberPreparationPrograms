package com.wipro.uber;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class PointPairSum {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 1,2,0,-4,3,4,5,2, 3, 4, 5,0};
		Map<Integer, HashSet<Point> >map = new HashMap<Integer, HashSet<Point>>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=a[i]+a[j];
				//Integer[] pair= {a[i],a[j]};
				if(map.containsKey(sum)) {
					HashSet<Point> existList=map.get(sum);
					//if(!existList.contains(pair)) {
						existList.add(new Point(a[i],a[j]));
					//}
						
				}else {
					HashSet<Point> list= new HashSet<Point>();
					list.add(new Point(a[i],a[j]));
					map.put(sum, list);
				}
				
			}
		}
		
		for(Entry<Integer, HashSet<Point>> entry:map.entrySet()) {
			HashSet<Point> list= entry.getValue();
			if(list.size()>1) {
				for(Point pair:list) {
					System.out.print("["+(int)pair.getX()+" ,"+(int)pair.getY()+"]");
				}
			}
			System.out.println();
		}
	}
}
