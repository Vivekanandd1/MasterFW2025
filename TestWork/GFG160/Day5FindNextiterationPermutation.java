package GFG160;
import java.util.Arrays;

public class Day5FindNextiterationPermutation {

	 public static void nextPermutation(int[] arr) {
	        int n = arr.length;
	        int pivot = -1;

	        // Step 1: Find pivot index
	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] < arr[i + 1]) {
	                pivot = i;
	                break;
	            }
	        }

	        // Step 2: If no pivot, reverse whole array
	        if (pivot == -1) {
	            reverse(arr, 0, n - 1);
	            return;
	        }

	        // Step 3: Find element from right greater than pivot
	        for (int i = n - 1; i > pivot; i--) {
	            if (arr[i] > arr[pivot]) {
	                swap(arr, i, pivot);
	                break;
	            }
	        }

	        // Step 4: Reverse suffix from pivot+1 to end
	        reverse(arr, pivot + 1, n - 1);
	    }

	    // Helper: Swap two elements
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    // Helper: Reverse array section
	    private static void reverse(int[] arr, int left, int right) {
	        while (left < right) {
	            swap(arr, left, right);
	            left++;
	            right--;
	        }
	    }

	    // Test
	    public static void main(String[] args) {
	        int[] arr = {5, 4, 9, 6, 3, 1};
	        nextPermutation(arr);
	        System.out.println(Arrays.toString(arr));
	    }

}
