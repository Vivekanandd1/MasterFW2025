package BattleField;

public class NestedLoops {
	
	
	public static void main(String[] args) {
		int m=1;
		for(int i=0;i<=4;i++) 
			/*This is the Outer loop which will run untill i becomes equal or less than the four*/
		{
			for(int j=1;j<=4-i;j++) {
				/*This is the inner loop which will run untill j becomes equal or less than the zero*/
				System.out.print(m+" ");
				/*Prints the value at everytime with increment*/
				m++;
				/*Increments the M's value*/
			}
			System.out.println(" ");
		}
	}

}
