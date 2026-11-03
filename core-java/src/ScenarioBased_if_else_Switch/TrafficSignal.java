package ScenarioBased_if_else_Switch;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter color");
		char c=s.next().charAt(0);
		switch(c) {
		case 'R':
		case 'r':
			System.out.println("Stop");
			break;
		case 'Y','y':
			System.out.println("Ready");
			break;
		case 'G','g':
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Colour input");
		}
		s.close();

	}

}
