package Assignment_Arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={13, 4, 56, 32, 99, 11};
		
		for( int ele:a) {
			boolean flag=false;
			for(int i=2;i<=ele/2;i++) {
				if(ele%i==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(ele+" ");
			}
		}

	}

}
