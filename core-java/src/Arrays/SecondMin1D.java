package Arrays;

public class SecondMin1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {1,0,2,3,5};
	int min=a[0];
	int smin=a[0];
	for(int i=1;i<a.length;i++) {
		if(min>a[i]) {
			smin=min;
			min=a[i];
		}
		else if(min>a[i] && a[i]!=min) {
			smin=a[i];
		}
	}
	System.out.println("second min :" +smin);


	}

}
