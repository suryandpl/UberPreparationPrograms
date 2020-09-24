package test;

import java.util.HashMap;
import java.util.Map;

public class Forth {
	
	static class pair{
		int first,second;
		
		 pair(int a, int b){
			first=a;
			second=b;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {3,4,7,1,12,9};
		findPair(a);

	}

	private static void findPair(int[] a) {
		Map<Integer,pair> map =new HashMap<Integer, pair>();
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int sum = a[i]+a[j];
				if(!map.containsKey(sum)){
					map.put(sum,new pair(i,j));
				}
				else{
					  pair p = map.get(sum); 
					  
	                    // Since array elements are distinct, we don't 
	                    // need to check if any element is common among pairs 
	                    System.out.println("("+a[p.first]+", "+a[p.second]+ 
	                                      ") and ("+a[i]+", "+a[j]+")"); 
	                   
				}
			}
		}
		
		
	}

}
