package BreakAndContinue;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="Karimun@123";
		boolean flag=false;
		for(int i=1;i<=5;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter password");
			String p=sc.nextLine();
			if(p==password) {
				System.out.println("Success");
				flag=true;
				break;
			}
			sc.close();

			
	}
		if(!flag) {
			System.out.println("try after some time");
		}
	

	}
}
