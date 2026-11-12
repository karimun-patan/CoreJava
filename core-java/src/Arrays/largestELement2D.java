package Arrays;

public class largestELement2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {10, 25, 30},
			    {45, 20, 15},
			    {12, 80, 35}
			};
 for(int i=0;i<arr.length;i++) {
	int large=arr[i][0];
	for(int j=1;j<arr[0].length;j++) {
		if(large<arr[i][j]) {
			large=arr[i][j];
		}
		
	}
	System.out.println("largest in each : "+ large);
	
}

	}

}

