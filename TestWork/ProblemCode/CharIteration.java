package ProblemCode;

public class CharIteration {
	public static void main(String[] args) {
		String name = "Vivekanand";
		int count = 1;
		for(int i=name.length()-1;i>=0;i--) {
			if(name.charAt(i)==name.charAt(i)) {
				System.out.println(name.charAt(i)+" count is: "+ count);
			}
		}
	}

}
