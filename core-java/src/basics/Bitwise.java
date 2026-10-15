package basics;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter first number:");
	int n1=sc.nextInt();
	
	System.out.println("enter second number:");
	int n2=sc.nextInt();
	
	System.out.println("Bitwise AND of" + n1+ "and" + n2 + ":" + (n1&n2));
	System.out.println("Bitwise OR of" + n1 + "and" + n2 + ":" +(n1|n2));
	System.out.println("Bitwise XOR of " + n1 + "and" + n2 + ":" +(n1^n2));
	System.out.println("Bitwise NOT of " + n1 + ":" + (~n1));
	System.out.println("Bitwise left shift of " + n1 + "and" + n2 + ":" +(n1<<n2));
	System.out.println("Bitwise right shift of " + n1 + "and" + n2 + ":" +(n1>>n2));
	 sc.close();
	

	}

}
