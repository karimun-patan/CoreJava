package SelectionStatements2;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elitricity bill units consumed:");
		int unit=sc.nextInt();
		
		if(unit>=0 && unit<=100) {
			System.out.println(" Electricity Bill:"+ (unit*2));
		}
		else if(unit>=101 && unit<=200) {
			System.out.println(" Electricity Bill:"+ (unit*3));
		}
		else if(unit>200) {
			System.out.println(" Electricity Bill:"+ (unit*5));
		}
		else {
			System.out.println("Invalid Units");
		}
		sc.close();

	}

}
