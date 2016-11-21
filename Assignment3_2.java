import java.util.Scanner;

public class Assignment3_2 {
	
// Declaration
	static boolean same;
	
//Method to compare strings	
	public boolean sameCheck(String s3 , String s4){
		
		same = s3.equals(s4);
		return same;	
	}
	
	public static void main(String[] args) {
		
//		Initialize variables
		String S1 = null;
		String S2 = null;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		S1 = s.next();
		System.out.println("Enter 2nd string: ");
		S2 = s.next();
		
		Assignment3_2 a = new Assignment3_2();
		same = a.sameCheck(S1,S2);
		
		System.out.println("Same = " + same);
}
}
