package oops;

public class Hello {
	void print(Collage c) {
		System.out.println(c.id+"----"+c.name);
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		
		Collage c= new Collage();
		c.id=11;
		c.name="litonn";
		h.print(c);

	}

}



class Collage{
	int id;
	String name;
}
