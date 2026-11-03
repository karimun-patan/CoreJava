package ForLoopPrograms;

import java.util.Scanner;

public class SumOfNaturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println("Sum of natural numbers :"+sum);
	sc.close();

	}

}
