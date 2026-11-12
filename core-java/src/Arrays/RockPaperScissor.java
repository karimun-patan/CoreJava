package Arrays;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"r","s","p"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Choic 0 to 2:");
		int us=sc.nextInt();
		while(us<0||us>=3) {
			System.out.println("Invalid choice plz enter valid choice");
			us=sc.nextInt();
		}
		String uc=arr[us];
		System.out.println("user choice :" +uc);
		
		Random rm=new Random();
		int comch=rm.nextInt(3);
		String comchoice=arr[comch];
		System.out.println("computer choice :" +comchoice);
		if(uc.equals("r")&&comchoice.equals("s") || uc.equals("s") && comchoice.equals("p") || uc.equals("p") && comchoice.equals("r")) {
			System.out.println("user win.......");
		}
		else if(uc.equals(comchoice)) {
			System.out.println("game tie....");
			
		}else {
			System.out.println("computer win.....");
		}
		sc.close();
		

	}

}
