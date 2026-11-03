package WhileLoopPrograms;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number");
	    int n=sc.nextInt();
	    int i=0;
	    int j=1;
	    int c=0;
	    while(n>0) {
	    	c=i+j;
	    	System.out.println(i+" ");
	    	i=j;
	    	j=c;
	    	n--;	
	    }
	    sc.close();
	    
	    

	}

}
