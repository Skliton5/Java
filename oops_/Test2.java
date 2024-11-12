package oops_;

public class Test2 extends User{
	public Test2() {
		System.out.println("Child Constructor Called");
	}
	int rank;
	void m2() {
		System.out.println("Child method :: called");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m2();
		t.m1();
		t.id=109;
		t.name="liton";
		t.rank=3;
		System.out.println(t.id+"---"+t.name+"---"+t.rank);
	}

}
