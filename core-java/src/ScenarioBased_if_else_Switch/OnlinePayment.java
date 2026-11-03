package ScenarioBased_if_else_Switch;

import java.util.Scanner;

public class OnlinePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Payment Mode");
		int n=s.nextInt();
		switch(n) {
		case 1:
			System.out.println("UPI");
			break;
		case 2:
			System.out.println("Debit Card");
			break;
		case 3:
			System.out.println("Credit Card");
			break;
		case 4:
			System.out.println("Net Banking");
			break;
		default:
			System.out.println("Invalid selection");
		}
		
		s.close();
	}

}
