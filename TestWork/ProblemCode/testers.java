package ProblemCode;

import java.util.Arrays;

public class test {
	
	public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
	    // Your code here
	    int ans = Integer.MAX_VALUE;
	    for(int i=0; i<1001;i++){
	        int sum=0;
	        for(int j=0;j<n;j++){
	            if(arr.get(j).size()>i){
	            sum = sum+arr.get(i).get(j);
	            }
	        }
	        
	        if(sum>0){
	            ans = Math.min(ans,sum);
	        }
	    }
	    
	    return ans;
	}	

}

