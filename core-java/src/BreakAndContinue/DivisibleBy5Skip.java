package BreakAndContinue;


public class DivisibleBy5Skip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("All the numbers from 1 to 50 except 5 divisibles:");
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
			   continue;
			}
			System.out.println(i);
		}
		
	}

}
