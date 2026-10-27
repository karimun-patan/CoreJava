
//Check Whether three sides can form an equilateral triangle
package SelectionStatements2;

import java.util.Scanner;

public class Equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st side:");
		int n1=sc.nextInt();
		System.out.println("enter 2nd side:");
		int n2=sc.nextInt();
		System.out.println("enter 3rd side:");
		int n3=sc.nextInt();
	    if(n1==n2 && n2==n3) {
	    	System.out.println("Form equilateral triangle");
	    }else {
	    	System.out.println("Not form equilateral traingle");
	    }
		
		sc.close();

	}

}
