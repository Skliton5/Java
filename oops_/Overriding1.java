package oops_;

public class Overriding1 extends Overriding {
	void marry() {
		System.out.println("Marry with Ani");
	}
	public static void main(String[] args) {
		Overriding1 ov = new Overriding1();
		ov.marry();
	}

}
