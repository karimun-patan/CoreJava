package Arrays;

public class SumofElemntsin2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int[][] a= {{10,20},{30,40},{60,70}};
	  for(int i=0;i<a.length;i++) {
		  int sum=0;
		  for(int j=0;j<a[i].length;j++) {
			  sum=sum+a[i][j];
		  }
		  System.out.println("sum: "+sum);
	  }
	  System.out.println();
	}

}
