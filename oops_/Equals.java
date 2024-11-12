package oops_;

import java.util.Objects;

public class Equals {
	int id;
	String name;
	
	public Equals(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Equals e = new Equals(11, "liton");
		Equals e1 =new Equals(10, "ani");
		System.out.println(e.equals(e1));
		System.out.println(e==e1);
		String s = new String("hi");
		String s1= new String("hi");
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals other = (Equals) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
