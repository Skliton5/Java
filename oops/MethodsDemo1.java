package oops;

public class MethodsDemo1 {

	public static void main(String[] args) {
		MethodsDemo1 m = new MethodsDemo1(); 
				int x = m.add(10, 20); 
		System.out.println(x); 
	}

	int add(int a, int b) {
		int c = a + b;
		return c;
	}
}
			
	