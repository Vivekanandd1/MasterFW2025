package BattleFieldInterfaces;

public class TestClass implements TestInterfaces {
	
	
	public static void main(String[] args) {
		TestClass a = new TestClass();
		a.RedLight();
		a.GreenLight();
		a.YellowLight();
		a.LightBlink();
	}

	@Override
	public void RedLight() {
		System.out.println("Stop");
		
	}

	@Override
	public void GreenLight() {
		System.out.println("Go");
		
	}

	@Override
	public void YellowLight() {
		System.out.println("Check and go");
		
	}

}
