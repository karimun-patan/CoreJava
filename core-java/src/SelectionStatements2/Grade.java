package SelectionStatements2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter marks");
	    int n=sc.nextInt();
	    if(n>100 || n<0) {
	    	System.out.println("Enter valid marks");
	    }
	    else if(n>=90) {
	    	System.out.println("A");
	    }else if(n>=80) {
	    	System.out.println("B");
	    }else if(n>=70) {
	    	System.out.println("C");
	    }else if(n>=55) {
	    	System.out.println("D");
	    }else if(n>=35) {
	    	System.out.println("E");
	    }else {
	    	System.out.println("Failed");
	    }
       sc.close();
	}

}
