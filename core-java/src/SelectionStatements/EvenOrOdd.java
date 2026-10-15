package SelectionStatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");
		}
		sc.close();

	}

}
