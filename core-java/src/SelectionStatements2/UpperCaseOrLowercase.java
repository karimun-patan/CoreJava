package SelectionStatements2;

import java.util.Scanner;

public class UpperCaseOrLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character");
		char c=s.next().charAt(0);
		if(Character.isLowerCase(c)) {
			System.out.println("LowerCase");
		}
		else {
			System.out.println("UpperCase");
		}
		s.close();
	}

}
