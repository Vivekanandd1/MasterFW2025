
public class Day11MaxSubProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,-8,7,-1,2,3};
		System.out.println(MaxProd(arr));

	}
	
	private static int MaxProd(int[] arr) {
		// TODO Auto-generated method stub
	  int Maxval = arr[0];
	  int Minval = arr[0];
	  int MaxProd = arr[0];
	  
	  for(int i =1;i<arr.length;i++) {
		  int temp = max(arr[i], Maxval*arr[i], Minval*arr[i]);
		  Minval =  min(arr[i], Maxval*arr[i], Minval*arr[i]);
		  Maxval = temp;
		  MaxProd = Math.max(MaxProd, Maxval);
		  
	  }
		return MaxProd;

	}

	static int min(int a, int b, int c) {
		return Math.min(a,Math.min(a, b));
	}
	
	static int max(int a, int b, int c) {
		return Math.max(a,Math.max(a, b));
	}

}
