package BreakAndContinue;

import java.util.Scanner;

public class ATMpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int pin=1234;
		boolean r=false;
		int i=1;
		while(3>=i) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter pin");
			int p=sc.nextInt();
			if(pin==p)
			{
				System.out.println("Login Successfully");
				r=true;
				break;
			}
	  i++;
	  sc.close();		}
		if(!r) {
			System.out.println("Account locked");
		}

	}

}
