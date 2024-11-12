package oops_;

public class Clone  implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c = new Clone();
		System.out.println(c);
		Object clone = c.clone();
		System.out.println(clone);
		
	}

}
