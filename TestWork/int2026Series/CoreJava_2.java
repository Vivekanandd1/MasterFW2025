package int2026Series;

import java.util.*;

/*•	Find duplicate characters in a String*/
public class CoreJava_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Text = sc.next();
		List<Character> duplicate = new ArrayList<>();
		
		//Vatsal
		
		for(int i=0;i<Text.length();i++) {
			for(int j=i+1;j<=Text.length()-1;j++) {
				if(Text.charAt(i)==Text.charAt(j) && !duplicate.contains(Text.charAt(i))) {
					duplicate.add(Text.charAt(j));
				}

			}
		}
		
		System.out.println(duplicate);
		sc.close();
	}

}
