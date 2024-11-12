package exception;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			System.out.println("try block started");
			int i=10/2;
			System.out.println("try block ended");
			}catch (Exception e){
				System.out.println("catch block started");
				e.printStackTrace();
				System.out.println("Catch Block Ended");
				}finally {
					System.out.println("Finally Block Execute");
				}
		System.out.println("Main Methos Executed");
	}

}
