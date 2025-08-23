package GFG160;

public class Day10MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,-8,7,-1,2,3};
		System.out.println(MaXSub(arr));

	}
	
	static int MaXSub(int[] arr) {
		int res = arr[0];
		int maxend =  arr[0];
		for(int i=1;i<arr.length;i++) {
			maxend = Math.max(maxend+arr[i], arr[i]);
			res = Math.max(res, maxend);
		}
		return res;
	}

}
