package ProblemCode;

import java.util.Arrays;

public class test {
	
	 public static boolean areAnagrams(String s1, String s2) {
	       char[] c1 = s1.toCharArray();
	       char[] c2 = s2.toCharArray();
	       
	       Arrays.sort(c1);
	       Arrays.sort(c2);
	        // Your code here
	        
	      s1 = new String(c1) ;
	      s2 = new String(c2) ;
		return s1.equalsIgnoreCase(s2);
	      
	    
	      
	}
 
	 
	 public static void main(String[] args) {
		 test t  = new test();
		 t.areAnagrams("abcd", "dbcde");
				 
	}
	
	
}

