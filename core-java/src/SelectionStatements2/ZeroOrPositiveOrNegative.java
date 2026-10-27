package SelectionStatements2;

import java.util.Scanner;

public class ZeroOrPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n1=sc.nextInt();
		if(n1==0) {
			System.out.println("Zero");
		}
		else if(n1>0) {
			System.out.println("Positive Number");
		}else {
			System.out.println("Negative Number");
		}
 sc.close();
	}

}
