package ProblemCode;

public class InvertedTriangle {
	
	 public static void main(String[] args) {
	        int n = 3; // Number of rows

	        int i = 1; // Row counter

	        // Outer loop for rows
	        while (i <= n) {
	            int j = 1;

	            // Loop for spaces
	            while (j <= (n - i)) {//j=2,  "  *
	                System.out.print("  ");
	                j++;
	            }

	            // Loop for stars
	            while (j <= n) {
	                System.out.print("* ");
	                j++;
	            }

	            // Move to the next line
	            i++;
	            System.out.println();
	        }
	    }

}
