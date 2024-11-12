package hello;


public class VarArg {
	public void add(int... a) {
		int sum=0;
		for(int s:a) {
			sum=sum+s;
		}System.out.println(sum);
	}
	public static void main(String[] args) {
		VarArg v = new VarArg();
		v.add(100,200);
		v.add(100,200,300);
	}
	

}
