package Arrays;

import java.util.Arrays;

public class MoveAllZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,0,1,2,7};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
