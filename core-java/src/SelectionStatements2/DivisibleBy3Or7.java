package SelectionStatements2;

import java.util.Scanner;

public class DivisibleBy3Or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%3==0) {
			System.out.println("Divisible by 3");
		}else if(n%7==0) {
			System.out.println("Divisible by 7");
		}
		else {
			System.err.println("Not Divisible by 3 or 7");
		}
          sc.close();
	}

}
