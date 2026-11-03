package WhileLoopPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		while(temp>0) {
			c+=1;
			temp=temp/10;
		}
		int sum=0;
		while(temp>0) {
			int rem=n%10;
			int power=1;
			int j=1;
			while(c>=j) {
				power=power*rem;
			}
			sum=sum+power;
		}
		if(sum==temp) {
		System.out.println("ArmStrong Number");
		}
		
		sc.close();

	}

}
