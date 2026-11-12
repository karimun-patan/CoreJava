package Assignment_Arrays;

import java.util.Scanner;

public class ElementPresentorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,4,9,0};
		Scanner sc=new Scanner(System.in);
		boolean c=false;
		System.out.println("Enter element:");
		int ele=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(ele==a[i]) {
				c=true;
				break;
			}
		}
		if(!c) {
			System.out.println("not present in array");
		}else {
			System.out.println("present in array");
		}
		sc.close();

	}

}
