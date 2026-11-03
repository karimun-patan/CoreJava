package ForLoopPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
          int n=sc.nextInt();
          int c=0;
          for(int i=1;i<=n;i++) {
        	  if(n%i==0) {
        		  c+=1;
        	  }
          }
          if(c==2) {
        	  System.out.println("prime Number");
          }
          else {
        	  System.out.println("Not prime number");
          }
          sc.close();
	}

}
