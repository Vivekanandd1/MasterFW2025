package ProblemCode;

public class StartPattern {
	public static void main(String[] args) {
        int n = 3;

        int i = 1; // Row counter

        while (i <= n) {
            int j = 1; // Column counter for stars

            // Inner loop for printing stars
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            // Move to the next line after completing one row
            System.out.println();
            i++;
        }
    }

}
