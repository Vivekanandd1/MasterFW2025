import java.util.ArrayList;

public class Stream1 {
	
	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Bob");
		Names.add("Brenda");
		Names.add("Victor");
		Names.add("Alex");
		Names.add("Brock");
		
		Names.stream().filter(s->s.startsWith("b"));
		System.out.println(Names.stream().filter(s->s.startsWith("B")).count());
		Names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}

}
