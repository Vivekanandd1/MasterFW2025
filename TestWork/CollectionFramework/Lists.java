package CollectionFramework;

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Vivek");
		ls.add("Damini");
		ls.add("Vatsal");
		
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println(ls.contains("Vatsal"));
		System.out.println(ls.get(1));
		ls.removeAll(ls);
		System.out.println(ls);
		
		
		
		
		
	}

}
