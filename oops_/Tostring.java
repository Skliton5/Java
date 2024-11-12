package oops_;

public class Tostring {
	 int id;
	 String name;
	 

	public static void main(String[] args) {
		Tostring s= new Tostring();
		System.out.println(s);
			
	}
	public String toString() {
		return id+"---"+name;
	}
	
}
