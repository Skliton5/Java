package hello;

public class Demo implements Cloneable{

	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		Object obj = d;//upcasting
		Object ob= d.clone();
		Demo d1=(Demo) ob;//downcasting
		
		
		
	}

}
