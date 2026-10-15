package basics;

import java.util.Scanner;

public class TernaryOperater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age");
	    int age=sc.nextInt();
	    String s=(age>=18) ? "Eligible for Vote" : "Not Eligible for Vote";
	    System.out.println(s);
		
	    sc.close();

	}

}
