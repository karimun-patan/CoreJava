package Arrays;

import java.util.Arrays;

public class MoveAllZerosFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,0,3,4,0};
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				a[j]=a[i];
				j--;
			}
		}
		while(j>=0) {
			a[j]=0;
			j--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
