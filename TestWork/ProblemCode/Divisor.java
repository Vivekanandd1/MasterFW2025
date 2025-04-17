package ProblemCode;

import java.util.Scanner;

public class Divisor {
	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc  = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i=1;
	        while(n%i==0){
	            System.out.print(i+" ");
	            i++;
	        }
	        
	    }

}
