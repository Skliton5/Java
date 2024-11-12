package oops;

public class Static_Variable {
	String name;
	int rollno;
	static String instituteName;

	public static void main(String[] args) {
		Static_Variable.instituteName="Liton it";
		Static_Variable st = new Static_Variable();
		st.name="liton";
		st.rollno=22;
		System.out.println(st.name+ "  " + st.rollno +"  " + instituteName);
		
		Static_Variable st1 = new Static_Variable();
		st1.name="Sambit";
		st1.rollno=22;
		System.out.println(st1.name+ "  " + st1.rollno +"  " + instituteName);
		
		
		
	}

}
