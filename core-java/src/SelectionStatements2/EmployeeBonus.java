package SelectionStatements2;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Experience");
		float n=s.nextFloat();
		if (n<0) {
			System.out.println("Enter valid number");
		}
		else if(n>0 && n<=1) {
			System.out.println("Bonus :" + 5000);
		}
		else if(n>1 && n<=2) {
			System.out.println("Bonus :" + 10000);
		}
		else if(n>2 && n<=4) {
			System.out.println("Bonus :" + 15000);
		}
		else if(n>4 && n<=5) {
			System.out.println("Bonus :" + 20000);
		}
		else {
			System.out.println("Bonus :" +30000);
		}
		
s.close();
	}

}
