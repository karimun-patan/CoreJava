package Arrays;

import java.util.Arrays;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		  int[] a=new int[5];
		  a[0]=1;
		  a[1]=2;
		  a[2]=3;
		  a[3]=4;
		  a[4]=5;
		  System.out.println(Arrays.toString(a));
		  for(int i=0;i<a.length;i++) {
			  System.out.println(a[i]);
			  }
		  for(int ele:a) {
			  System.out.print(ele+" ");
		  }
		  }

}
