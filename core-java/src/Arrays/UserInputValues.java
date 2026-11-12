package Arrays;

import java.util.Scanner;

public class UserInputValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		//inserting elements
		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++) {
		    arr[i]=sc.nextInt();
		}
		//display elements
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		

	}

}
