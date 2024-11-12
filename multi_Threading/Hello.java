package multi_Threading;

public class Hello {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
	}

}
 