package exception;

public class Finally1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("try block started");
			int i=10/0;
			System.out.println("try block ended");
			}finally {
			System.out.println("Finally Block Execute");
				}
		System.out.println("Main Methos Executed");
	}

}
