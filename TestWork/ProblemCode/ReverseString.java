package ProblemCode;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Vivekanand Deshmukh";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

}
