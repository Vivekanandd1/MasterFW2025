package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Votecounter {
	
	/*
	 Method	                                    Description
    put(K key, V value)	                        Adds a key-value pair
    get(Object key)	                            Retrieves the value for a key
    isEmpty()	                                Checks if the map is empty
    remove(Object key)	                        Removes the key-value pair
    containsKey(Object key)	                    Checks if the key exists
    containsValue(Object value)                 Checks if the value exists
    replace(K key, V value)	                    Replaces the value for a key
    size()	                                    Returns the number of key-value pairs
    keySet()	                                Returns a set of all keys
    values()	                                Returns a collection of all values
    entrySet()	                                Returns a set of key-value mappings
    getOrDefault(Object key, V defaultValue)	Returns a value or default value
    clear()	                                Removes all the mappings
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[] = {"DE", "AB", "CD", "AB", "AB", "AB", "FG", "FG", "BC", "yuu"};
        
        System.out.println(electionWinner(arr));
	}
	
	public static String electionWinner(String arr[]) {
        // Your code here
        HashMap<String,Integer>hm  = new HashMap<>();
        for(String name: arr) {
        	hm.put(name, hm.getOrDefault(name, 0)+1);
        }
		String winner = "";
		int maxVote=0;
        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
        	String candidate = entry.getKey();
        	int vote = entry.getValue();
        	
        	if(vote>maxVote || (vote==maxVote && candidate.compareTo(winner)>0)) {
        		winner = candidate;
        		maxVote = vote;
        	}
        }
        return winner;
    }

}
