package ProblemCode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreations {

	public static void main(String[] args) {
		// Specify the file path
		File obj = new File("D:\\File.txt");
		
		try {
		  if (obj.createNewFile()) {
              System.out.println("File created: " + obj.getName());
          } else {
              System.out.println("File already exists.");
          }
      } catch (IOException e) {
          System.out.println("An error occurred.");
      }

		// Check if the file exists
		if (obj.exists()) {
			// Print the file information
			System.out.println("File Name: " + obj.getName());
			System.out.println("Absolute Path: " + obj.getAbsolutePath());
			System.out.println("Writable: " + obj.canWrite());
			System.out.println("Readable: " + obj.canRead());
			System.out.println("File Size: " + obj.length() + " bytes");
		} else {
			System.out.println("File does not exist.");
		}
		
		try {
            // Specify the file path
            FileWriter writer = new FileWriter("D:\\File.txt");

            // Write data to the file
            writer.write("Java is a programming language");

            // Close the writer
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		
		try {
            // Specify the file path
//            File obj = new File("D:\\File.txt");
            // Create a Scanner object to read the file
            Scanner myReader = new Scanner(obj);
            // Read the file line by line
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            // Close the reader
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

	}

