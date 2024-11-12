package abstract_;

public class Machine extends Disele{
	
	public Machine() {
		System.out.println("Child constructor");
	}
	public void fillfuel() {
		System.out.println("Filling fuel tank");
	}

	public static void main(String[] args) {
		Machine m = new Machine();
		m.fillfuel();
		m.start();
	}

}
