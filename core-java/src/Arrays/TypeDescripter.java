package Arrays;

public class TypeDescripter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[5];
		System.out.println(a.getClass());
		       /*[ = One-Dimensional Array
				[[ = Two-Dimensional Array
				I = Primitive int type marker
				B = Primitive byte type marker*/
		System.out.println(a.toString());
		System.out.println(a.equals(a));
		System.out.println(a.hashCode());

	}

}
