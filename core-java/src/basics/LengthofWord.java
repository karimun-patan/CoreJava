package basics;
import java.util.Scanner;

public class LengthofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0;
        String s1="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		System.out.println(l);
        		l=0;
        	}
        	else {
        		l=l+1;
        	}
        }
        System.out.println(l);
	}

}
