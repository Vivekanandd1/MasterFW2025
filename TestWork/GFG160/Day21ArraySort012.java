package GFG160;

public class Day21ArraySort012 {

	    static void sort012(int[] arr) {
	        int n = arr.length;
	        System.out.println(n);
	        
	        // initialize three pointers:
	        // lo: boundary for 0s
	        // mid: current element being checked
	        // hi: boundary for 2s
	        int lo = 0;//0,
	        int hi = n - 1;//5
	        int mid = 0;//0,1
	        // { 0, 1, 2, 0, 1, 2 };
	        // { 0, 
	        
	        // process elements until mid crosses hi
	        while (mid <= hi) {
	            if (arr[mid] == 0) { 
	                
	                // current is 0: swap with lo and move both 
	                // pointers forward
	                int temp = arr[lo]; // 0
	                arr[lo] = arr[mid];
	                lo++;
	                arr[mid] = temp;
	                mid++;
	            }
	            else if (arr[mid] == 1) {
	                // current is 1: it's already in correct position
	                mid++;
	            }
	            else {
	                // current is 2: swap with hi and move hi backward
	                // do not increment mid, as swapped value needs
	                // to be re-checked
	                int temp = arr[mid];//2
	                arr[mid] = arr[hi];//
	                arr[hi--] = temp;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = { 0, 1, 2, 0, 1, 2 };
	        int n = arr.length;

	        // sort the array in-place
	        sort012(arr);

	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	    }
	
}
