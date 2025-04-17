package ProblemCode;

import java.util.Scanner;

public class EvenIndicesOfString {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
        
    }

}
