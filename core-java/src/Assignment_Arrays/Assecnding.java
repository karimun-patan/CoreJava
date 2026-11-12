package Assignment_Arrays;

import java.util.Arrays;

public class Assecnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,7,3,9,0};
	
		for(int i=0;i<a.length;i++)
		for(int j=i+1;j<a.length;j++) {
		    if(a[i]>a[j]) {
		    	int temp=a[i];
		    	a[i]=a[j];
		    	a[j]=temp;
		    }
		}
		System.out.println(Arrays.toString(a));
		

	}

}
