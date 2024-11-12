package constructor;

public class ConstructorOvrrerloading {
	int id;
	String name;
	public ConstructorOvrrerloading(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(this.id+"---"+this.name);
	}
	public ConstructorOvrrerloading(String name) {
		this.name=name;
		System.out.println(this.name);
	}
	

	public static void main(String[] args) {
		ConstructorOvrrerloading c = new ConstructorOvrrerloading("liton");
		ConstructorOvrrerloading c1 = new ConstructorOvrrerloading(1, "sambit");
	}

}
