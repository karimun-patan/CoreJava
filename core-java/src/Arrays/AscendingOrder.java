package Arrays;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[]= {13,5,2,3,10};
		Arrays.sort(a);
		System.out.println("In ascending Order:");
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		System.out.println("In descending Order:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
