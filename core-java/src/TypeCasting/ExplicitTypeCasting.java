package TypeCasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=980.90;
		int e= (int)d;
		System.out.println(e);
		System.out.println(((Object)e).getClass().getSimpleName());
		
		long l=2345;
		short s=(short)l;
		System.err.println(s);
		
		long n=123456789;
		byte b=(byte)n;
		System.out.println(b);//loss of data
		
		int t=45;
		char c=(char)t;
		System.out.println(c);
		
		char r='r';
		int n1=(int)r;
		System.out.println(n1);
		

	}

}
