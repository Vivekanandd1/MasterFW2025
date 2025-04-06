package ProblemCode;

import java.util.Scanner;

public class Calculator {
	
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int operator = sc.nextInt();
	        int a = sc.nextInt();
            int b = sc.nextInt();
	        
	        if(operator!=1 && operator!=2 && operator!=3){
	            System.out.println("Invalid input");
	            
	        }
	        else{
	       
	        if(operator==1){
	            System.out.println(a+b);
	        }
	        else if(operator==2){
	            System.out.println(b-a);
	        }
	        else if(operator==3){
	            System.out.println(a*b);
	        }
	        }
	    }
	
}
