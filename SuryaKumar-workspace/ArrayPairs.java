package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Finding pairs which equals to same result
//Eg: input: {1,2,3,4,5} output : [1,4],[2,3] & [1,5],[2,4]
public class ArrayPairs {
	//Solution 1 :: 
	public static void findPairs(int[] arr) {
		Map<Integer,List<Integer[]>> map = new HashMap<Integer, List<Integer[]>>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				Integer[] pair = {arr[i],arr[j]};
				if(map.containsKey(sum)) {
					List<Integer[]> existList = map.get(sum);
					existList.add(pair);
					map.put(sum, existList);
				}else {
					List<Integer[]> list = new ArrayList<Integer[]>();
					list.add(pair);
					map.put(sum, list);
				}
			}
		}
		for(Entry<Integer, List<Integer[]>> result : map.entrySet()) {
			List<Integer[]> valList = result.getValue();
			if(valList.size()>1) {
			for(Integer[] pairArr : valList) {
				//for(int i=0;i<pairArr.length;i++) {
				System.out.println("values : "+Arrays.toString(pairArr));
				//}
			}
			}
		}
	}
	//Solution 2 ::
	public static void findPairs1(int[] arr) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				String pair = "["+arr[i]+","+arr[j]+"]";
				if(map.containsKey(sum)) {
					String existList = map.get(sum);
					existList+=pair;
					map.put(sum,existList);
				}else {
					map.put(sum,pair);
				}
			}
		}
		for(Entry<Integer, String> result : map.entrySet()) {
			String valList = result.getValue();
			if(valList.length()>5) {
			System.out.println(valList);
			}
			  
			 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		findPairs(arr);
		
		//for sol3
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				set.add(arr[i]+arr[j]);
			} 
		}
		System.out.println("Set : "+set);
		for(Integer sumVal : set) { 
			  findPairs(arr, sumVal); 
		}		
	}
	//Solution 3::
	static void findPairs(int[] arr, int sumVal) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			System.out.println("Pairs for the value : "+sumVal);
			for(int i=0;i<arr.length;i++) {
				if(map.containsKey(arr[i])) {
				System.out.println("("+arr[i]+", "+map.get(arr[i])+")");	
				}
				map.put(sumVal-arr[i],arr[i]);
		
		}
	}
	//solution :: 4
		static void findPairs1(int[] arr){
		HashMap<Integer,HashSet<Integer[]>> map = new HashMap<Integer,HashSet<Integer[]>>();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				//skiping the same elements like (2,2)
				if(arr[i] != arr[j]){			
					int sum = arr[i]+arr[j];
					Integer[] pair = {arr[i],arr[j]};

					if(map.containsKey(sum)){
						HashSet<Integer[]> existPair = map.get(sum);
						boolean notExist =false;
						//skiping the pair if already exists(duplicates)
						for(Integer[] existArr : existPair){ 
							if(existArr[0]!=arr[i] && existArr[1]!=arr[j]){
								notExist=true;
							}else{
								notExist=false;
								//System.out.println("Pair exists already"+(arr[i]+","+arr[j]));
								break;
							}
						}
						if(notExist) {
							existPair.add(pair);
						}
					}else {
						HashSet<Integer[]> set = new HashSet<Integer[]>();
						set.add(pair);
						map.put(sum,set);
					}
				}
			}
		}
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			
			HashSet<Integer[]> value = map.get(key);
			if(value.size()>1) {
				System.out.print(key+" array pairs are : [");
				for(Integer[] arr1 : value) {
					System.out.print(Arrays.deepToString(arr1));
				}
				System.out.println("]");
			}
		}
	}
	

}
