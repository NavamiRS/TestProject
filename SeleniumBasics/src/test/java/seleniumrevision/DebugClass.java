package seleniumrevision;

public class DebugClass {




	private static final int a=5;
	
	public static void main(String[] args) {
		
		int marks[]= {a,2,3};
		
		int g=90;
		
		printAllMarks(marks,0,g);
		
	

	}
	private static void printAllMarks(int marks[],int count,int g) {
		for(int mark:marks) {
			System.out.println(mark);
			
		}
		
	}

}



