package int2026Series;

import java.util.*;

/*•	Reverse a String without using StringBuilder.reverse()*/
public class CoreJava_1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String Text = sc.next();
		int n=Text.length()-1;
//		char[] ch = Text.toCharArray();
/*With default for loop*/
		for(int i=n;i>=0;i--) {
			System.out.print(Text.charAt(i));
		}
//		
//		for(char c: ch) {
//			System.out.print(c);
		
		sc.close();
			
		}
	

		
	
}
