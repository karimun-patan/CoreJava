package SelectionStatements;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Simple if
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Positive Number");
		}
		System.out.println("program Completed");
		sc.close();

	}

}
