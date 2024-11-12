package oops_;

public class Driver {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
	int hashcode  =	c.hashCode();
	System.out.println("Hashcode::"+ hashcode);
		
	}

}
