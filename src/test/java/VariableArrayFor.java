
public class VariableArrayFor {

	public static void main(String[] args) {
		int[] Arr = {12,23,32,49,52};
		
		System.out.println("Normal Loop");
		for (int i=0; i<Arr.length;i++) {
			System.out.println(Arr[i]);
			
		}
		
		System.out.println(".............................................");
		/*Enahanced For Loop*/
		System.out.println("/*Enahanced For Loop*/");
		for (int i  : Arr) {
			System.out.println(i);
		}
			
		System.out.println(".............................................");
		
		System.out.println("Loop with conditinal statements");
		
		for (int i=0; i<Arr.length;i++) {
			if(Arr[i]%2==0) {
			System.out.println(Arr[i]);
			}
			else 
			{
		    System.out.println(Arr[i] + " is not multiple of 2");
			}
		}
		
		System.out.println(".............................................");
		System.out.println("reversing the array values");
		for (int i=Arr.length-1; i>=0;i--) {
			System.out.println(Arr[i]);
			
		}
		
		}

	}


