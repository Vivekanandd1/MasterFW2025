package BattleFieldArrays;

public class MultiDimensionArray {	
	public static void main(String[] args) {
		
		/*Have to find smallest number from an Array*/
		
		int a[][] = {{5,6,7},{1,2,3},{8,9,4}};
		int min = a[0][0];
		int max = a[0][0];
		/*Same program will work for both min and Max kind of number*/
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
