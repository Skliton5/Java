package oops_;

public class Super {
	void m1() {
		System.out.println("parent Method ");
	}

}
class Childd extends Super{
	void M1() {
		super.m1();
		System.out.println("Child Method");
	}
	public static void main(String[] args) {
		Childd c = new Childd();
		c.m1();
		
	}
}
