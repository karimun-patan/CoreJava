package basics;

import java.util.Scanner;

public class LowerAndUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String n=sc.nextLine();
        System.out.println("The Upper case :" + n.toUpperCase());
        System.out.println("The Lower case :" + n.toLowerCase());

	}

}
