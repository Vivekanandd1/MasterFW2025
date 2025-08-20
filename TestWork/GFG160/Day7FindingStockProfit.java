package GFG160;

public class Day7FindingStockProfit {
	
	public static void main(String[] args) {
		 int[] arr = {122, 122, 123, 121, 123, 122, 198, 228};
		 System.out.println(MaxProfit(arr));
	}
	
	static int MaxProfit(int[] arr) {
		int res = 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				res = res+arr[i]-arr[i-1];//122
			}
		}
		
		return res;
	}

}
