package ScenarioBased_if_else_Switch;

import java.util.Scanner;

public class ATMService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
	    int n=sc.nextInt();
	    switch(n) {
	    case 1:
	    	System.out.println("Balance Enquiry");
	    	break;
	    case 2:
	    	System.out.println("Cash Withdrawal");
	    	break;
	    case 3:
	    	System.out.println("Deposit");
	    	break;
	    case 4:
	    	System.out.println("Mini Statement");
	    	break;
	    default:
	    	System.out.println("Please Enter between 1 to 4");
	    }
	    sc.close();

	}

}
