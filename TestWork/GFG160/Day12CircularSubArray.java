package GFG160;

public class Day12CircularSubArray {
	
	 public static void main(String[] args) {
	        int[] arr = {8, -8, 9, -9, 10, -11, 12};
	        System.out.println(maxCircularSum(arr));
	    }

	 private static int maxCircularSum(int[] arr) {
		 
		 int CurMax = 0;
		 int CurMin = 0;
		 int totalSum = 0;
		 int MaxSum = arr[0];
		 int MinSum = arr[0];
		// TODO Auto-generated method stub
		 
		 for(int i=0;i<arr.length;i++) {
			 /* {8, -8, 9, -9, 10, -11, 12};*/  
			 CurMax = Math.max(CurMax+arr[i], arr[i]);//1,12 = 13
			 MaxSum = Math.max(MaxSum, CurMax);//10,12 = 12
			 /*Finding max sum*/
			 
			 CurMin = Math.min(CurMin+arr[i], arr[i]);
			 MinSum = Math.min(MinSum, CurMin);//-11
			 /*Finding minimum sum*/
			 
			 totalSum += arr[i];//11
			 /*increasing the total sum*/
		 }
		 
		 int normal = MaxSum;//12
		 /*total sum assigned to a variable Normal sum*/
		 int CircularSum = totalSum-MinSum;//
		 /*Storing value of circular sum*/
		 if(MinSum==totalSum) {
			 return normal;
		 }
		return Math.max(CircularSum, normal);
	 }

}
