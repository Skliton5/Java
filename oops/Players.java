package oops;

public class Players {
	
	void print(Drive d) {
		System.out.println(d.id+"  "+d.name);
	}

	public static void main(String[] args) {
		Players p = new Players();
		
		Drive d= new Drive();
		d.id=101;
		d.name="liton";
		p.print(d);
		

	}

}

class Drive{
	int id;
	String name;
}
