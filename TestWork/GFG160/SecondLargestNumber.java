package GFG160;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = {1,35,7,19,34,35};
		
		int result = Number(arr);
		if(result==-1) {
			System.out.println("No second largest number in array");
		}
		
		else {
			System.out.println("The second largest element is "+ result);
		}
	}
	
	public static int Number(int arr[]) {
		
     int n = arr.length;
     
     if(n<2) {
    	 return -1;
     }
     
     int first =Integer.MIN_VALUE, second=Integer.MIN_VALUE;
     
    for(int num: arr) {
    	 if(num>first) {
    		 second = first;
    		 first = num;
    	 }
    	 else if(num>second && num!=first) {
    		 second = num;
    	 }
   
    	 
     };
     
     return (second ==Integer.MIN_VALUE)?-1:second;
     
		
	}

}
