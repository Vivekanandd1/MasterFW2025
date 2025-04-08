package ProblemCode;

import java.util.Scanner;

public class DigitInNumber {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        int count = 0;
	        while (n > 0) {
	            n = n / 10;
	            ++count;
	        }
	        System.out.print("Number of digits : " + count);
	    }

}
