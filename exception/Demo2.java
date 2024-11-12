package exception;

public class Demo2 {

	public static void main(String[] args) {
		try {
			int i= 10/0;
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("it's an Error");
	}

}
