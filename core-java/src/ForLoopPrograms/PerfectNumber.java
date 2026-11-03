package ForLoopPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perfect number is a positive integer that equals the sum of its proper positive divisors
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			  }
		}
		if(sum==num) {
			
			System.out.println("perfect number");
		}else {
			System.out.println("Not perfect number");
		}
		sc.close();

	}

}
