package exception;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("try block startrd");
			int i= 10/0;
			System.out.println("try block ended");
		} catch (Exception e) {
			System.out.println("Catch block started");
			e.printStackTrace();
			System.out.println("catch block ended");
			}
		System.out.println("main method ended");
	}

}
