package ForLoopPrograms;

import java.util.Scanner;

public class FibannocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibanocci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number");
	  int num=sc.nextInt();
	  int n1=0;
	  int n2=1;
	  for(int i=1;num>=i;i++) {
		 int sum=n1+n2;
		 System.out.println(n1);
		 n1=n2;
		 n2=sum;
		
	  }
	  sc.close();

	}

}
