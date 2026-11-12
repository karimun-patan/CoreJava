package Oop;


public class Student {
	    int sid;
		String sname;
		float marks;
		static String institute="codegnan";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
             Student s1=new Student();
             int sid=10;
             s1.sid=100;
             s1.sname="ram";
             s1.marks=90.9f;
             System.out.println(s1);
             System.out.println(s1.sid);
             System.out.println(s1.sname);
             System.out.println(s1.marks);
             System.out.println(sid);
             System.out.println(institute);
             institute="1000COders";
             String institute="naresh it";
             institute="jspiders";
             System.out.println(institute);
             System.out.println(s1.institute);
	}

}
