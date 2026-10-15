package SelectionStatements;

import java.util.Scanner;

public class GradeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		
		if(marks<0 || marks>100)
		{
	    	System.out.println("Invalid marks");
	    }
		else if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=75)
		{
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else if(marks>=40)
		{
			System.out.println(" Grade D");
	    }
		else {
			System.out.println("Failed");
		}
		sc.close();
				
		}

}
