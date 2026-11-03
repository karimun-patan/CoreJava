package ForLoopPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int c=0;
		for(int i=n;i>0;i=i/10) {
			c+=1;
					
		}
		for(int i=n;i>0;i=i/10) {
			int rem=i%10;
			int power=1;
			for(int j=1;j<=c;j++) {
				power=power*rem;
			}
			sum=sum+power;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		sc.close();
		
	}

}
