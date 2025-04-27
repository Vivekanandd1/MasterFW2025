package ProblemCode;

public class Constructor {
	public static void main(String[] args) {
		// This will cause a compilation error because no default constructor exists
		Test p = new Test(0, 0); // Providing default values to avoid error
		p.print();
	}
}

class Test {

	int x, y;

	// Parameterized Constructor
	Test(int a, int b) {
		x = a;
		y = b;
	}

	void print() {
		System.out.println("x = " + x + ", y = " + y);
	}
}
