package BattleFieldInterfaces;

public interface TestInterfaces {
	
	public void RedLight();
	public void GreenLight();
	public void YellowLight();
	public default void LightBlink() {
		System.out.println("lets go");
	}

}
