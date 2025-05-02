package ProblemCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
        try {
            // Call a method that includes a `finally` block
            methodA();

            // Open a file using Scanner, which may throw FileNotFoundException
            Scanner in = new Scanner(new File("test.in"));

            /* Additional statements that might throw exceptions */
            System.out.println("Processing the file...");
            
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught...");
        } catch (FileNotFoundException ex) {
            // Handle cases where the file is not found
            System.out.println("FileNotFoundException caught...");
        } catch (Exception ex) {
            System.out.println("A new type of exception has occurred...");
        } finally {
            // This block will always execute
            System.out.println("finally-block runs regardless of the state of exception");
        }

        System.out.println("After try-catch-finally, life goes on...");
    }

    // Method to demonstrate the use of a `finally` block
    public static void methodA() {
        System.out.println("Entering methodA()...");
        try {
            // Code that causes an ArithmeticException
            System.out.println(1 / 0);
        } finally {
            System.out.println("finally in methodA()");
//            int balance = Integer.parseInt(args[0]);
        }
        System.out.println("Exiting methodA()");
        
    }
    

}
