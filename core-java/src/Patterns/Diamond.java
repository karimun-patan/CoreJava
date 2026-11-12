package Patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int h=3-1;h>=1;h--) {
		for(int l=1;l<=3-h;l++) {
			System.out.print(" ");
		}
		for(int a=1;a<=2*h-1;a++) {
			System.out.print("*");
		}
		System.out.println(" ");

	}
	}

}
