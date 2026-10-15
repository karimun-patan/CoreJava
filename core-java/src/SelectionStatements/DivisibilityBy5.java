package SelectionStatements;

import java.util.Scanner;

public class DivisibilityBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(n%5==0) {
			System.out.println("Divisible by 5");
		}
      sc.close();
	}

}
