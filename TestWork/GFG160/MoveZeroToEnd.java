package GFG160;

import java.util.Iterator;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 0, 4, 3, 0, 5, 0 };

		MoveZero(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static int[] MoveZero(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) 
				/* checks if element in array is not equal to zero */
			{   
				int temp =  arr[i];
				/* Store value in temporary variable */
				/*example : 5 will be stored in temp */
				arr[i] = arr[count];
				/* asign value of element in array to this index if its not zero */
				/*example : 5 will be stored in ith indext of arr cos the count value is 0 which having value as 5 */
				arr[count] = temp;
				/* asign value temporary value to this index which was present earlier */
				/*example : 5 will be stored in ith indext of arr cos the count value is 0 which having value as 5 */
				count++;
				
			}
			
		}
		return arr;
	}
}
