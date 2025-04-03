package ProblemCode;

import java.util.Scanner;

public class FindingLastDigit {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     // Print the last digit
     int Lastdigit = Math.abs(n%10);
     System.out.println(Lastdigit);
     /*code*/
}
}
