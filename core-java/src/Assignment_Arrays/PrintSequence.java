package Assignment_Arrays;

public class PrintSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=(i*i)+1;
		}
		for(int ele:a) {
			System.out.print(ele+" ");
		}
	}

}
