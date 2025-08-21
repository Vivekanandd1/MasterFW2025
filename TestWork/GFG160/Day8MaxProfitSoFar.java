package GFG160;

public class Day8MaxProfitSoFar {
	
	public static void main(String[] args) {
		 int[] arr = {122, 122, 123, 121, 123, 122, 1, 198, 228};
		 System.out.println(MaxProfit(arr));
	}

	private static int MaxProfit(int[] arr) {
		int minSoFar = arr[0]; 
		int res = 0;
		for(int i=1;i<arr.length;i++) {
			/*Storing min valye from the array*/
			minSoFar = Math.min(minSoFar, arr[i]);//122
			/*Storing max value from array and min value and substracting it from the min so far*/
//			res = Math.max(res,arr[i]-minSoFar);
			 res = Math.max(minSoFar, arr[i])-minSoFar;
		}
		
		return res;
	}

}
