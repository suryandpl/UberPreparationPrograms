package ds_problems;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "abaccbddeffegghhijjikk abbb z";
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		int stringLength = str.length();
		
		for(int i = 0; i < stringLength; i++) {
			Character presentCharacter = str.charAt(i);
			if(hmap.containsKey(presentCharacter) == false) {
				hmap.put(presentCharacter, 1);
			}else {
				int presentCount = hmap.get(presentCharacter);
				presentCount++;
				hmap.put(presentCharacter, presentCount);
			}
		}
		
		boolean noNonRepeatingCharacter = false;
		
		for(int i = 0; i < stringLength; i++) {
			Character presentCharacter = str.charAt(i);
			int presentCount = hmap.get(presentCharacter);
			if(presentCount == 1) {
				System.out.println(presentCharacter);
				noNonRepeatingCharacter = true;
				break;
			}
		}
		
		if(noNonRepeatingCharacter == false) {
			System.out.println(-1);
		}
	}

}
