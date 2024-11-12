package array;

public class Arraydemo {

	public static void main(String[] args) {
		int [] x = new int [5];
		x[0] = 100;
		x[1] =200;
		x[2] =300;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println(x.length);
			
		for(int  i=0; i<x.length;i++) {
		System.out.println(x[i]);
			
		}
	}

}
