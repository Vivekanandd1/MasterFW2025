package GFG160;

public class Day19CheckWordsForPalindrome {


	    static int[] computeLPSArray(String pat) {
	        int n = pat.length();
	        int[] lps = new int[n];

	        // lps[0] is always 0
	        lps[0] = 0;
	        int len = 0;

	        // loop calculates lps[i] for i = 1 to n-1
	        int i = 1;
	        while (i < n) {

	            // if the characters match, increment len
	            // and set lps[i]
	            if (pat.charAt(i) == pat.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            }

	            // if there is a mismatch
	            else {

	                // if len is not zero, update len to
	                // the last known prefix length
	                if (len != 0) {
	                    len = lps[len - 1];
	                }

	                // no prefix matches, set lps[i] to 0
	                else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }
	        return lps;
	    }

	    // returns minimum character to be added at
	    // front to make string palindrome
	    static int minChar(String s) {
	        int n = s.length();
	        String rev
	            = new StringBuilder(s).reverse().toString();

	        // get concatenation of string, special character
	        // and reverse string
	        s = s + "$" + rev;

	        // get LPS array of this concatenated string
	        int[] lps = computeLPSArray(s);

	        // by subtracting last entry of lps array from
	        // string length, we will get our result
	        return (n - lps[lps.length - 1]);
	    }

	    public static void main(String[] args) {
	        String s = "aacecaaaa";
	        System.out.println(minChar(s));
	    }
	}


