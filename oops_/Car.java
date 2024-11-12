package oops_;

public class Car  {
	
	void drive() {
		Engine eng = new Engine();
		eng.start();
		System.out.println("Journy Started");
		
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		System.out.println("yo");
		
		
	}

}
