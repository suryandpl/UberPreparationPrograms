package test;

import java.util.HashMap;
import java.util.Map;

public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      int[] a = {2,3,4,5,5,6,7,7};
      findDuplicate(a);
	}

	private static void findDuplicate(int[] a) {
      Map<Integer,Integer> map = new HashMap<Integer, Integer>();
      for(int i=0;i<a.length;i++){
    	  if(map.containsKey(a[i])){
    		  map.put(a[i], map.get(a[i])+1);
    	  }
    	  else{
    		  map.put(a[i], 1);
    	  }
      }
      for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    	  if(entry.getValue()!=1){
    		  System.out.println("duplicate element is : "+entry.getKey());
    	  }
    	  
      }
	}

}
