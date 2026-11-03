package BreakAndContinue;

import java.util.Scanner;

public class SkipNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  10 numbers:");
		for(int i=1;i<=10;i++) {
			
			int n=sc.nextInt();
			if(n<0) {
				continue;
			}
			System.out.println(n);
			
		}
		sc.close();

	}

}
