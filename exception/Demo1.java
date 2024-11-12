package exception;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Main method Ended");
		try {
			System.out.println("try Block Started");
			String s= "liton";
			System.out.println(s.length());
			System.out.println("Try Block Endded");
		}catch(Exception e){
			System.out.println("Ctach block Started");
			e.printStackTrace();
			System.out.println("Catch Block Ended");
			}
		System.out.println("Main method Ended");
	}

}
