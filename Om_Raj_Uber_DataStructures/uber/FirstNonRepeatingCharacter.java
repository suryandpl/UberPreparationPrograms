package com.wipro.uber;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "find first non repeating character in this sentencex";

		LinkedHashMap<Character, Integer> counts = new LinkedHashMap<Character, Integer>(str.length());

		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
