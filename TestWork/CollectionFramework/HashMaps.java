package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps
{
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(200, "Pulsar");
		hm.put(400, "Dominar");
		hm.put(900, "Z900");
		hm.put(1250, "GSBMW");
		Set<?> sn = hm.entrySet();
		Iterator<?> it = sn.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		
			
		
		};
		
	}

}
