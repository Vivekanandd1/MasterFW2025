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
    	 if(num>first) 
    	/*Description: Checks if element in array is greater than the value of First variable*/	 
    	 {
    		 second = first;
    		 /*Description: Assigns Variable First's value to Second Variable*/	 
    		 first = num;
    		 /*Description: Assigns the value of Num to first*/	 
    	 }
    	 else if(num>second && num!=first)
    		 /*Description: Checks if element in array is greater than the Value of Variable second's value and not equal to value
    		  * Variable First's*/	 
    	 {
    		 second = num;
    		 /*Description: Assigns the value of Num to second*/	 
    	 }
   
    	 
     };
     
     return (second ==Integer.MIN_VALUE)?-1:second;
     /*Description: (Turnery Expression) where it checks if variable second's value not changed than it will return -1
      * actual value of Variable second*/	 
		
	}

}
