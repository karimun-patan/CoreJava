package SelectionStatements;

import java.util.Scanner;

public class IfConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);//ctrl+shift+o to import packges 
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	if (age>=18) {
		System.out.println("Your are eligible for vote");
	}
	System.out.println("program completed");
	
	sc.close();

	}

}
