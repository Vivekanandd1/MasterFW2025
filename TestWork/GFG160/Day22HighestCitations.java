package GFG160;

public class Day22HighestCitations {

	    static int hIndex(int[] citations) {
	        int n = citations.length; //5 
	        int[] freq = new int[n + 1];//6 // {}

	        // Count the frequency of citations
	        for (int i = 0; i < n; i++) {
	            if (citations[i] >= n) //6 is big than 5 
	                freq[n] += 1;
	            else
	                freq[citations[i]] += 1;
	        }

	        int idx = n;//5//4
	        
	        // variable to keep track of the count of papers
	        // having at least idx citations
	        int s = freq[n]; 
	        while (s < idx) {//0<5
	            idx--;
	            s += freq[idx];
	        }
	        
	        // return the largest index for which the count of 
	        // papers with at least idx citations becomes >= idx
	        return idx;
	    }

	    public static void main(String[] args) {
	        int[] citations = {6, 0, 3, 5, 3};  // {1,0,0,2,0,2}
	        System.out.println(hIndex(citations));
	    }
	

}
