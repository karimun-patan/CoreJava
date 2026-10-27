package SelectionStatements2;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1=sc.nextInt();
		System.out.println("enter second Number");
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println("Largest :" +n1);
		}
		else {
			System.out.println("Largest :" +n2);
		}
		sc.close();
		

	}

}
