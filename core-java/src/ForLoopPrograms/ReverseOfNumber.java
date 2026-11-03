package ForLoopPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int rev=0;
		for(;n>0;n=n/10) {
			int rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of given number :" +rev);
		sc.close();

	}

	
}
