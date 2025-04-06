package ProblemCode;

public class LargerstNumber {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 30;
		int Temp = Math.max(a, b);
		int Largest = Math.max(Temp, c);
		//System.out.println(Largest);
		
		
		/*One more Approach*/
		if (a>=b  && a>=c) {
			System.out.println(a + " is Largest");
		}
		else if (b>=c  && b>=c) {
			System.out.println(b + " is Largest");
		}
		else {
			System.out.println(c + " is Largest");
		}
	}

}
