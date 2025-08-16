package GFG160;

public class Day3ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 0, 4, 3, 0, 5, 0 };
		ReverseArray(arr);
		for(int m:arr) {
			System.out.print(m+" ");
		}

	}
	
	public static int[] ReverseArray(int[] arr) {
	int n= arr.length;
	
	for (int i=0;i<n/2;i++) 
	/*traversing till half of the array length*/
	{
		int temp = arr[i];
		/*Storing the ith index value in temporary variable*/
		arr[i] = arr[n-i-1];
		/*Storing the array length minus ith index value to ith index +6+1/e*/
		arr[n-i-1]=temp;
		/*Storing variable temp's value in the array length minus ith index*/
		}
		
		return arr;
	}

}
