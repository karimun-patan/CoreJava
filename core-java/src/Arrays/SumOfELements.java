package Arrays;

public class SumOfELements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,34,5};
		int g=a[0];
		int s=a[0];
		int sum=0;
		for(int ele:a) {
			sum+=ele;
		}
		System.out.println("Sum of elements: "+sum);
		
  //gratest
		for(int i=1;i<a.length;i++) {
			if(g<a[i]) {
				g=a[i];
				
			}
		}
		System.out.println("Greatest of elements: " +g);
		
    //smaller
		for(int i=1;i<a.length;i++) {
			if(s>a[i]) {
				s=a[i];
				
			}
		}
		System.out.println("smallest of elements: " +s);
	}

}
