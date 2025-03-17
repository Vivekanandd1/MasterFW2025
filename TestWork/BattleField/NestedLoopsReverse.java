package BattleField;

public class NestedLoopsReverse {
	
	public static void main(String[] args) {
		int m=1;
		for(int i=0;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) {
				
				System.out.print(m +" ");
				m++;
			}
			System.out.println(" ");
		}
	}

}
