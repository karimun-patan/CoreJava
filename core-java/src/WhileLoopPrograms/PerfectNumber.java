package WhileLoopPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=0;
	    int i=1;
	    while(n>i) {
	    	if(n%i==0) {
	    		sum=sum+i;
	    	}
	    i++;
	    	 
	  }
	    if(sum==n) {
	    	System.out.println("Perfect Number");
	    }else {
	    	System.out.println("Not perfect Number");
	    }
        sc.close();
	}

}
