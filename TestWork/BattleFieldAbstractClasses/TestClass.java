package BattleFieldAbstractClasses;

public class TestClass extends TestAbstractClass {
	
	public static void main(String[] args) {
		TestClass a = new TestClass();
		a.PressOne();
		a.PressTwo();
		a.PressThree();
		a.Bill();
		a.Ownclass();
	}

	@Override
	public void PressOne() {
		System.out.println("Bring water and menu");
		
	}

	@Override
	public void PressTwo() {
		System.out.println("One Large Pizza");
		
	}

	@Override
	public void PressThree() {
		System.out.println("One Medium Ratatouie");
		
	}
	
	public void Ownclass() {
		System.out.println("icecream");
		
	}

}
