package SelectionStatements;

import java.util.Scanner;

public class DayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		String day=sc.nextLine();
		day= day.toLowerCase();
		
		switch(day) {
		
		case "monday":
			System.out.println("1");
			break;
		case "tuesday":
			System.out.println("2");
			break;
		case "wednesday":
			System.out.println("3");
			break;
		case "thursday":
			System.out.println("4");
			break;
		case "friday":
			System.out.println("5");
			break;
		case "saturday":
			System.out.println("6");
			break;
		case "sunday":
			System.out.println("7");
			break;
		default:
			System.out.println("Invalid day");
		}
    sc.close();
	}

}
