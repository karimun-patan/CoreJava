package ForLoopPrograms;

import java.util.Scanner;

public class NumberOfidgits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number");
	    int n=sc.nextInt();
	    int count=0;
	    for(;n>0;n=n/10) {
	    	count+=1;
	    	
	    }
	    System.out.println(count);
	    sc.close();

	}

}
