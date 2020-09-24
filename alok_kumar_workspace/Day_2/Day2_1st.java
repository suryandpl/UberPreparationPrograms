package test;

public class Day2_1st {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      int[] a={1,2,3,4,5};
      int[] b={2,3,1,0,5};
      findElement(a,b);
	}

	private static void findElement(int[] a, int[] b) {
		int[] temp = new int[128];
         for(int i=0;i<a.length;i++){
        	 temp[a[i]]++;
        	 temp[b[i]]--;
        	 
         }
         
         for(int i=0;i<temp.length;i++){
        	 if(temp[i]==1){
        		 System.out.println(i);
        	 }
         }
	}

}
