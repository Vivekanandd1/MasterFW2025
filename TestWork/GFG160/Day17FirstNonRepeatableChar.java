package GFG160;

public class Day17FirstNonRepeatableChar {
	
	 public static void main(String[] args) {
	        String s = "vivekanand";
	        System.out.println(nonRep(s));
	    }

	 private static char nonRep(String s) {
		 
		 final int MAX_CHAR = 26;  
		 
		 int[] Freq = new int[MAX_CHAR];
		 
		 for(char c: s.toCharArray()) {
			 Freq[c-'a']++;
		 }
		 
		 for(char c: s.toCharArray()) {
			 if(Freq[c-'a']==1) {
				 return c;
			 }
		 }
		// TODO Auto-generated method stub
		return '$';
	 }

}
