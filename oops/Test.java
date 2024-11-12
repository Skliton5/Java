package oops;

public class Test {

	public static void main(String[] args) {
		Test t= new Test();
		
		Studentt s = new Studentt();
		s.id=101;
		s.name="liton";
		t.print(s);;
	}
	void print(Studentt s) {
		System.out.println(s.id+"  "+s.name);
	}

}


class Studentt{
	int id;
	String name;
}
