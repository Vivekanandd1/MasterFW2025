package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsTest {
	public static void main(String[] args) {
		
	
	ArrayList<String> ls = new ArrayList<String>();
	ls.add("Vivek");
	ls.add("Damini");
	ls.add("Vatsal");
	
	ArrayList<String> ms = new ArrayList<String>();
	ls.add("Vivek");
	ls.add("Damini");
	
	System.out.println(ms.containsAll(ls));
	System.out.println(ms.addAll(ls));
	System.out.print(ms);
	
	
	Iterator<String> it = ls.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println(".............................");
	for(String m: ms) {
		System.out.println(m);
	}
	
	}
	
	 
}
