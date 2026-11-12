package Arrays;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {10, 15, 20},
			    {25, 30, 35},
			    {40, 45, 50}
			};
		int even=0,odd=0;

		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 if(arr[i][j]%2==0) {
					 even+=1;
				 }
				 else {
					 odd+=1;
				 }
			 }
			 
		 }
		 System.out.println("Even:" + even +"odd : "+odd);
	}

}
