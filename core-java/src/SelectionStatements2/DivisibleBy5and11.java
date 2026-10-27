package SelectionStatements2;

import java.util.Scanner;

public class DivisibleBy5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		if(n%5==0 && n%11==0) {
			System.out.println("Divisible by both 5 and 11");
		}
		else if(n%5==0) {
			System.out.println("Divisible by 5");
		}
		else if(n%11==0) {
			System.out.println("Divisible by 11");
		}
		else {
			System.out.println("Not divicible by both 5 and 11");
		}
		s.close();
	}

}
