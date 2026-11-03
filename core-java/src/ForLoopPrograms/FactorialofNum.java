package ForLoopPrograms;

import java.util.Scanner;

public class FactorialofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			
		}
		System.out.println("factorial of given number:" +fact);
		sc.close();

	}
	

}
