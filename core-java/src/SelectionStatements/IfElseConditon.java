package SelectionStatements;

import java.util.Scanner;

public class IfElseConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		if (marks>34) {
			System.out.println("You are passed");
		}
		else {
			System.out.println("You are failed");
		}
		
sc.close();
	}

}
