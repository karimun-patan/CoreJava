package LoopingStatements;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact*=i;
			
		}
		System.out.println("Factorial of " + n + ":" + fact);
		sc.close();

	}


}
