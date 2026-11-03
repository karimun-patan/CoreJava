package ScenarioBased_if_else_Switch;

import java.util.Scanner;

public class CustomerSupport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Options :");
		int y=sc.nextInt();
		switch(y) {
		default:
			System.out.println("Invalid option");
			break;
		case 1:
			System.out.println("billing");
			break;
		case 2:
			System.out.println("Technical Support");
		    break;
		case 3:
			System.out.println("Complaint");
			break;
		case 4:
			System.out.println("Feedback");
			
		
		}
		sc.close();

	}

}
