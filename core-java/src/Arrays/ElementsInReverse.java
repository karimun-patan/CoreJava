package Arrays;

import java.util.Scanner;

public class ElementsInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("Enter Elements:");
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in reverse order:");
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
		sc.close();

	}

}
