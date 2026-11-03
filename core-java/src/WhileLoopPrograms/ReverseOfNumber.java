package WhileLoopPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int temp=0;
		while(n>0) {
			int rem=n%10;
			temp=temp*10+rem;
			n=n/10;
		}
			System.out.println("Reverse :" +temp);
			sc.close();
		}

	}


