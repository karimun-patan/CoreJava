package SelectionStatements2;

import java.util.Scanner;

public class TriangleUsingAngles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first angle:");
		int first =sc.nextInt();
		System.out.println("enter second angle:");
		int second=sc.nextInt();
		System.out.println("enter third angle");
		int third=sc.nextInt();
		
		if (first<=0 || second<=0 || third<=0 || first+second+third!=180) {
			System.out.println("Not Valid Trianle");
		}
		else {
			System.out.println("valid triangle");
		}
     sc.close();
	}

}
