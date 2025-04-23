package ProblemCode;

public class DistinctNumberInArray {
	

	    public static void main (String[] args) {
	        int[] a = {10, 20, 10, 20, 30};
	        int n = a.length;

	        // Call the function to count distinct elements
	        System.out.println("Distinct Count: " + countDistinct(a, n));
	    }

	    // Function to count distinct elements in the array
	    public static int countDistinct(int[] a, int n) {
	        int count = 0;

	        // Loop through each element in the array
	        for (int i = 0; i < n; i++) {
	            boolean isDistinct = true;

	            // Check all previous elements for duplicates
	            for (int j = i - 1; j >= 0; j--) {
	                if (a[i] == a[j]) {
	                    isDistinct = false; 
	                    break;
	                }
	            }

	            // If the element is distinct, increment the count
	            if (isDistinct) {
	                count++;
	            }
	        }

	        return count;
	    }
	}


