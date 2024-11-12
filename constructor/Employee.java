package constructor;

public class Employee {
	public Employee(int id, String name, double salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee e =new Employee(11, "liton", 29000.78);
		Employee e1 =new Employee(12, "somu", 39000.78);
		Employee e2=new Employee(13, "Babu", 49000.78);
		Employee e3 =new Employee(14, "batu", 59000.78);
		Employee e4 =new Employee(15, "babul", 69000.78);
		Employee e5 =new Employee(16, "shankar", 79000.78);
		
	}

}
