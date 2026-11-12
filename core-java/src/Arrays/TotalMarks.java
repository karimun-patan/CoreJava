package Arrays;

public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{80,90,70},{20,60,70},{30,60,80}};
		
		for(int i=0;i<a.length;i++) {
			
			int total=0;
			for(int j=0;j<a[i].length;j++) {
				total=total+a[i][j];
				
			}
			System.out.println("Total marks of "+ (i+1)+" " + total);
		}
		System.out.println();
		

	}

}
