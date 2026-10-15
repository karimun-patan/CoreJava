package basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);//it is used to take user input from keyboard
		
		System.out.println("please enter ur name : ");
		String name = sc.nextLine();
		
		System.out.println("enter yout Age:");
		int Age = sc.nextInt();//nextInt will create one new line /n so it will go to nextline that nextline is read by that nextLine method so it is skipping that input taken
		sc.nextLine();//it is used to overcome this issue
		
		System.out.println("enter ur subject");
		String subject = sc.nextLine();
		
		
		//nextLine is used to read the input from user and it is storing the name variable 
		System.out.println("you have enterd :" +name);
		System.out.println("you have entered :" +subject);
		System.out.println("you have entered :"+Age);
		
		  sc.close();

	}

}
