package ProblemCode;

public class GetterSetter {
	
	 private int marks;

	    public  void setMarks(int marks) {
	        if (marks < 0 || marks > 100) {
	            throw new IllegalArgumentException("Marks should be between 0 and 100");
	        }
	        this.marks = marks;
	    }

	    public int getMarks() {
	    	System.out.println("In the " + marks);
	        return marks;
	    }
	    
	    public static void main(String[] args) {
	    	GetterSetter gs  = new GetterSetter();
	    	gs.setMarks(20);
	    	gs.marks = 19;
	    	gs.getMarks();
		}
	    

}
