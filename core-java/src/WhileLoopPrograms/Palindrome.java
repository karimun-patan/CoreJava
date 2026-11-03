package WhileLoopPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int c=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			c=c*10+rem;
			n=n/10;
		}
		if(temp==c) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
         sc.close();
	}

}
