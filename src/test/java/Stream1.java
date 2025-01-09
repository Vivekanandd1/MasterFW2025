import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
	
	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Bob");
		Names.add("Brenda");
		Names.add("Victor");
		Names.add("Alex");
		Names.add("Brocka");
		
		Names.stream().filter(s->s.startsWith("b"));
		//Brings out the count of the Arraylist without running into long code of for loop and conditional statements.
		System.out.println(Names.stream().filter(s->s.startsWith("B")).count());
		//Prints all the value which goes beyond the length of 4
		Names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("....................................................");
		//Prints which charachter ends with "a" and makes them uppercase
		Stream.of("Rama", "Shayma","sita","Laxman","Bharat").filter(s->s.endsWith("a")).
		map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("....................................................");
		//Prints which charachter Starts with "S" and sorting them and turning them into uppercases
		Stream.of("Rama", "Shayma","Sita","Laxman","Bharat").filter(s->s.startsWith("S")).sorted().
		map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("....................................................");
		//Prints which charachter Starts with "S" and sorting them and turning them into uppercases
		 ArrayList<String> Name1 = new ArrayList<String>();
		 Name1.add("Dean");
		 Name1.add("Roman");
		 Name1.add("Seth");
		 
		 List<String> Name2 = Arrays.asList( "John","Randy","Rey");
		 
		 Stream<String> con = Stream.concat(Name1.stream(), Name2.stream());
		 con.sorted().forEach(s->System.out.println(s));
		 
		 
	}

}
