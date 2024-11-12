package oops;

public class Driver {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Employee e= new Employee();
		e.id=101;
		e.name="Liton";
		d.hello(e);
	}
		
		void hello(Employee e) {
			System.out.println(e.id+"  "+e.name);
		
		
		
		
	}

}


class Employee{
	int id;
	String name;
}
