package SelectionStatements2;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1=sc.nextInt();
		System.out.println("Enter second Number");
		int n2=sc.nextInt();
		System.out.println("Enter third Number");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest Number:" +n1);
		}else if(n2>n3) {
			System.out.println("Greatest Number:" +n2);
		}
		else {
			System.out.println("Greatest Number :" + n3);
		}
		
      sc.close();
	}

}
