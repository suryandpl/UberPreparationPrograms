package test;

public class Third {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a ={1,4,2,5};
		//int[] a ={2,3,4,1,4,5};
		//middleIndex(a);
		findIndex(a);

	}

	private static void findIndex(int[] a) {
      int n=a.length;
      int[] prefix = new int[n];
      int[] suffix = new int[n];
      prefix[0]=a[0];
      for(int i=1;i<n;i++){
    	  prefix[i]=prefix[i-1]+a[i];
      }
      
      suffix[n-1]=a[n-1];
      for(int i=n-2;i>=0;i--){
    	  suffix[i]=suffix[i+1]+a[i];
      }
      
      for(int i=0;i<n;i++){
    	  if(prefix[i]==suffix[i]){
    		  System.out.println("index is : "+i);
    	  }
      }
	}

	private static void middleIndex(int[] a) {
        int left_sum =0, right_sum=0;
        int n = a.length;
        for(int i=1;i<n;i++){
        	right_sum=right_sum+a[i];
        }
        for(int i=0,j=1;j<n;i++,j++){
        	right_sum=right_sum-a[j];
        	left_sum=left_sum+a[i]; 	
        	if(left_sum==right_sum){
        		System.out.println("index is : "+(i+1));
        	}
        }
	}

}
