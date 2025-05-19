package CollectionFramework;

import java.util.HashSet;

public class HashSetDistinct {
	
	public static void main(String[] args) {
		
		int a[] = {4,8,9,10,25,89,77};
		int b[] = {41,18,19,40,25,89,77};
		System.out.println(CountDistnict(a,b));
	}

	private static int CountDistnict(int[] a, int[] b) {
		HashSet<Integer> s = new HashSet<>();
		HashSet<Integer> t = new HashSet<>();
		for(int i:a) {
			s.add(i);
		}
		for(int i:b) {
			if(s.contains(i)) {
			t.add(i);
			}
		}
		System.out.println(t);
		return t.size();
		
	}

}
