package test;

public class Fifth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       String s = "abede";
      int n= makePelindrome(s);
      System.out.println(n);
	}

	private static int makePelindrome(String s) {
      
    	  if(checkPelin(s)){
    		  return 0;
    	  }
    	  else{
    		  s=s.substring(1);
    		  return 1+makePelindrome(s);
    	  }
      
	}

	private static  boolean checkPelin(String s) {
       String r = new StringBuilder(s).reverse().toString();
       if (s.equals(r)){
    	   return true;
       }
       else
    	   return false;
	}

}
