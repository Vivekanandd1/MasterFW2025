import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> Arlst = new ArrayList<String>();
		Arlst.add("Vivek");
		Arlst.add("Damini");
		Arlst.add("Vardan");
		Arlst.add("Ekarshi");
		
		
		
		for(int i=0;i<Arlst.size();i++) {
			System.out.println(Arlst.get(i));
		}
		
		System.out.println("**************************");
		
		for (String Fam : Arlst) {
			System.out.println(Fam);
		}
	}
	

}
