package Arrays;

public class MovieTicketsin2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m= {{1,0,1,1},{1,0,1,1},{0,1,1,1}};
		for(int i=1;i<m.length;i++) {
			for(int j=1;j<m[i].length;j++) {
				if(m[i][j]==1) {
					System.out.println("Booked");
				}
				else {
					System.out.println("Available");
				}
			}
		}
		

	}

}
