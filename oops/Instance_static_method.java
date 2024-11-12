package oops;

public class Instance_static_method {

	public static void main(String[] args) {
		System.out.println("Hello Liton");
		Instance_static_method s1 = new Instance_static_method();
		s1.hello();
		
		Instance_static_method.greet();
		
	}
	
	void hello() {
		System.out.println("Hello Sambit");
	}
	         static void greet() {
		System.out.println("Hello yo");
	}

}
