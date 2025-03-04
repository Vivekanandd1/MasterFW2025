package BattleField;

public class DoWhile {
	public static void main(String[] args) {
		int i=0;
		
		do { 
			i++;
			System.out.println(i);
			
		} while (i<10);
		System.out.println(i<10);
		/*The statement System.out.println(i < 10); prints false because after exiting 
		the loop, i == 10, making i < 10 false.*/
		System.out.println("Incremented "+ i);
	}

}
