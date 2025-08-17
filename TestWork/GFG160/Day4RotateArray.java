package GFG160;

public class Day4RotateArray {
  public static void main(String[] args) {
	  int[] arr = {9,4,5,98,11,6,1,8,24};
	  
	  ArrRotate(arr, 13);
	  for(int n: arr) {
		  System.out.print(n+" ");
	  }
}
  
  static int[] ArrRotate(int[] arr, int d) {
	  int n= arr.length;
	   d %= n;
	   if (d == 0) return arr; 
	   Reverse(arr, 0, d-1);
	   Reverse(arr, d, n-1);
	   Reverse(arr, 0, n-1);
	   
	  return arr;
  }
  
  static void Reverse(int[] arr,int start, int end) {
	  while(start<end) {
		  int temp = arr[start];
		  arr[start]=arr[end];
		  arr[end]=temp;
		  start +=1;
		  end -=1;
	  }
  }
}
