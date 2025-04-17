package ProblemCode;

import java.util.Scanner;

public class ClassStarPatterns {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write Code Here
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
                System.out.print(" ");
            }
            System.out.println();
            i++;
        }
        sc.close();
    }

}
