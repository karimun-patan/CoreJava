package WhileLoopPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n<=1) {
	       System.out.println("Not prime number");

	      
		}else {

		int i=2;
		boolean p=true;
		while(i<(n/2)) {
			if(n%i==0) {
				p=false;
				break;
			}
			i++;
		}
		
		if(p) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
		}
		
      sc.close();
	}

}
