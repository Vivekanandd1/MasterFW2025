package int2026Series;

import java.util.*;

/*•	Count occurrence of each word in a sentence*/
public class CoreJava_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Text = sc.next();
		char[] ch = Text.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					count++;
//				}
//			}
//			System.out.println(ch[i] + " : " + count);
//		}
		
		HashMap<Character, Integer> CC = new HashMap<>();
		for(char c :ch) {
			CC.put(c, CC.getOrDefault(c,0)+1);
		}
		
		System.out.println(CC);

	}
}
