package SelectionStatements2;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		System.out.println("Enter third Number");
		int n3=sc.nextInt();
		if(n1<n2 && n1<n3) {
			System.out.println("Smallest Number is" + n1);
		}
		else if(n2<n3) {
			System.out.println("Smallest Number is" + n2);
		}
		else {
			System.out.println("Smallest Number is" + n3);
		}
		sc.close();

	}

}
