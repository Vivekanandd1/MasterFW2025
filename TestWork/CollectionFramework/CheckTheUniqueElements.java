package CollectionFramework;

public class CheckTheUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,8,9,10,25,4,89,77,89};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
