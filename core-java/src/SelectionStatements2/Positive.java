package SelectionStatements2;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println("Given number is positive");
		}
		else {
			System.out.println("Given number is negative");
		}
		sc.close();

	}

}
