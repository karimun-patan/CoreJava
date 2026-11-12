package Arrays;

public class Secondmax1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,34,5};
		int max=a[0];
		int second=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				second=max;
				max=a[i];	
			}
			else if(a[i]>second && a[i]!=max) {
				second=a[i];
			}
		}
		System.out.println("second max: "+second);

	}

}
