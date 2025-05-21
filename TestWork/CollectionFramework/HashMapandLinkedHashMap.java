package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapandLinkedHashMap {
	
	/*
	 Method	                                    Description
     put(K key, V value)	                    Adds a key-value pair
     get(Object key)	                        Retrieves the value for a key
     isEmpty()	                                Checks if the map is empty
     remove(Object key)	                        Removes the key-value pair
     containsKey(Object key)	                Checks if the key exists
     containsValue(Object value)                Checks if the value exists
     replace(K key, V value)	                Replaces the value for a key
     size()	                                    Returns the number of key-value pairs
     keySet()	                                Returns a set of all keys
     values()	                                Returns a collection of all values
     entrySet()	                                Returns a set of key-value mappings
     getOrDefault(Object key, V defaultValue)	Returns a value or default value
     clear()	                                Removes all the mappings
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash();
		Linked();

	}
	
	public static void Hash() {
		 Map<Integer, String> map = new HashMap<>();

	        map.put(100, "GfG");
	        map.put(200, "Courses");
	        map.put(150, "IDE");

	        System.out.println("HashMap "+ map);
	}
	
	public static void Linked() {
		 Map<Integer, String> map = new LinkedHashMap<>();

	        map.put(100, "GfG");
	        map.put(200, "Courses");
	        map.put(150, "IDE");

	        System.out.println("LinkedHashMap "+ map);
	}

}
