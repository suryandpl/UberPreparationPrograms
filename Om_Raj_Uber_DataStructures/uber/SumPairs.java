package com.wipro.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPairs {

	public static void main(String[] args) {

		Integer[] arr = { 1,1,2,3,4,5, 2, 3,4, 5 };

		Map<Integer, Map<Integer, Integer>> result = groupNumberBySum(arr);

		System.out.println(result);

	}

	public static List<Integer> getPossibleSum(Integer[] arr) {

		Arrays.sort(arr);

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {

			l.add(arr[i] + arr[arr.length - 1]);

		}

		return l;

	}

	public static Map<Integer, Map<Integer, Integer>> groupNumberBySum(Integer[] arr) {

		Map<Integer, Integer> map = null;

		Map<Integer, Map<Integer, Integer>> finalMap = new HashMap<>();

		List<Integer> sumList = getPossibleSum(arr);

		for (int m = 0; m < sumList.size(); m++) {

			Integer sum = sumList.get(m);

			map = new HashMap<>();

			for (int i = 0; i < arr.length; i++) {

				Integer x = arr[i];

				Integer subVal = sum - x;

				int index = Arrays.binarySearch(arr, subVal);

				if (index > -1) {

					if (x < subVal) {

						map.put(x, subVal);

					} else {

						map.put(subVal, x);

					}

				}

				finalMap.put(sum, map);

			}

		}

		return finalMap;

	}

}