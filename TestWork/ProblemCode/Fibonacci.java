package ProblemCode;

import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println( Fibonacci.fib(n));
	}
	
	public static int fib(int n) {
		int a = 0;
	    int b = 1;
	    int c;
	    
	    for(int i=2;i<=n;i++){
	        c = a+b;
	        a = b;
	        b = c;
	    }
		
		return b;
		
	}
}
