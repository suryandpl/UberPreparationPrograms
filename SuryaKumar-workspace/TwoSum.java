package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		//Solution 1 : O(n)
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; i < nums.length; i++) {
			if (target == nums[i] + nums[j]) {
				return new int[] {i,j};
			}
			}
			
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	//Solution 2 : By using Map
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	    public static void main(String args[]){
	    	int[] arr = {3,2,4};
	    	int[] nums = twoSum(arr,6);
	    	//int[] arr = {3,2,4};
	        //int[] nums = twoSum1(arr,6);
	        System.out.println("["+nums[0]+","+nums[1]+"]");
	    }
	    
	    

}
