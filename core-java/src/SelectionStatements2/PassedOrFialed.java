package SelectionStatements2;

import java.util.Scanner;

public class PassedOrFialed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks out of 100");
		int marks=sc.nextInt();
		if(marks>100 || marks<0) {
			System.out.println("Invalid marks");
		}else if(marks>=35){
			System.out.println("Exam is passed");
		}else {
			System.out.println("Exam is Failed");
		}
        sc.close();
	}

}
