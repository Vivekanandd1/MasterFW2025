package ProblemCode;

import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       
	       String arr[] = new String[n];
	       for(int i=0;i<n;i++){
	           arr[i] = sc.nextLine();
	       }
	       for(String k:arr){
	            System.out.println(k);
	        }
	       
	       
	}

}
