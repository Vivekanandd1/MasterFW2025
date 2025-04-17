package ProblemCode;

import java.util.Scanner;

public class TableDifference {
	
	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc = new Scanner(System.in);
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int range = 10;
	        for(int i=1; i<=range;i++){
	            int differ = (n1*i)-(n2*i);
	            System.out.print(differ+" ");
	        }
	        sc.close();	    }
	 

}
