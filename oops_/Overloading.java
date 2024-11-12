package oops_;

public class Overloading {
	void add(int i, int j) {
		System.out.println("sum::"+(i+j));
	}
	void add(int i, int j,int k) {
		System.out.println("sum::"+ (i+j+k));
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(10, 20);
		o.add(10, 20, 30);
	}

}
