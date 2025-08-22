package GFG160;

import java.util.Arrays;

public class Day9FindingMinimumDifference {

	public static void main(String[] args) {
		 int[] arr = {1 ,8 ,10 ,6 ,4 ,6 ,9 ,1};
		 System.out.println(minDifference(arr,7));
		 
	}
	
	static int minDifference(int[] arr,int k) {
		
		int n = arr.length;
		Arrays.sort(arr);
		/*{1, 121, 122, 122, 122, 123, 123, 198, 228};*/
		/*+50 - */
		int res = arr[n-1]-arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]-k<0)
			continue;
			int minx = Math.min(arr[0]+k, arr[i]-k);/*will store the min value*/
			int maxx = Math.max(arr[i-1]+k,arr[n-1]-k);
			res = Math.min(res, maxx-minx);
		}
	
		return res;

	}

}
