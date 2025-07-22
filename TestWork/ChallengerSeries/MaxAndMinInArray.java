package ChallengerSeries;

public class MaxAndMinInArray {
	
	public static void main(String[] args) {
		int[] arr = {9,4,5,98,11,6,1,8,24};
		int max=arr[0];
		int min=arr[0];
		
		/*First way*/
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1;j<arr.length;j++) {
//				if(arr[i]>arr[j] && arr[i]>max) {
//					max = arr[i];
//				}
//			}
//			
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1;j<arr.length;j++) {
//				if(arr[i]<arr[j] && arr[i]<=min) {
//					min = arr[i];
//				}
//			}
//		}
		
		/*Second way*/
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println(" " +min +"  "+ max);
	}

	}


