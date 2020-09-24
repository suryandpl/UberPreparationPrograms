package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Day2_2nd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String s="welcome back";
        firstNonrepetitive(s);
	}

	private static void firstNonrepetitive(String s) {
		char[] c=s.toCharArray();
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i], map.get(c[i])+1);
			}
			else{
				map.put(c[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1){
				System.out.println("1st firstNonrepetitive element is : "+entry.getKey());
		}
			System.exit(0);
		};
	}

}
