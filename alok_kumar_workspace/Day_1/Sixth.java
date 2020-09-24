package test;

public class Sixth {
	
	public static void main(String[] args) {
		
		int[] a1 = {2,3,4,5,6};
		int[] a2 = {5,6,7,8,9};
		commonInArray(a1,a2);
	}

	private static void commonInArray(int[] a1, int[] a2) {
		int[] c= new int[128];
        for(int i=0;i<a1.length;i++){
        	c[a1[i]]++;
        	c[a2[i]]++;        	
        }
        
        for(int i=0;i<c.length;i++){
        	if(c[i]==2){
        		System.out.println("common in arrays are : "+i);
        	}
        }
	}

}
