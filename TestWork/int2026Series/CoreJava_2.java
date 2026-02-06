package int2026Series;

import java.util.*;

/*•	Find duplicate characters in a String*/
public class CoreJava_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Text = sc.next();
    /*1st  way*/
		List<Character> duplicate = new ArrayList<>();
		for (int i = 0; i < Text.length(); i++) {
			for (int j = i + 1; j <= Text.length() - 1; j++) {
				if (Text.charAt(i) == Text.charAt(j) && !duplicate.contains(Text.charAt(i))) {
					duplicate.add(Text.charAt(j));
				}

			}
		}
		System.out.println(duplicate);
		
		System.out.println("Solution from 2nd code------------------------------------------------------");
		
		HashSet<Character> seen = new HashSet<>();
		HashSet<Character> DuplicateOne = new HashSet<>();
		
		for( char c: Text.toCharArray()) {
			if(!seen.add(c)) {
				DuplicateOne.add(c);
			}
		}
		System.out.println(DuplicateOne);
		sc.close();
	}

}
