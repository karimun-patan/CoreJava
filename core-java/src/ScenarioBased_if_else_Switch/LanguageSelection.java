package ScenarioBased_if_else_Switch;

import java.util.Scanner;

public class LanguageSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Menu");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("English");
			break;
		case 2:
			System.out.println("Telugu");
			break;
		case 3:
			System.out.println("Hindi");
			break;
		default:
			System.out.println("other language");
		}
   sc.close();
	}

}
