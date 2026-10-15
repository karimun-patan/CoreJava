package basics;

public class OverfloowOfByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=127;// range of byte is -128 to 127 
		b++;
		System.out.println(b);
		
		byte c=-128;
		c--;
		System.out.println(c);// Underflow 

	}

}
