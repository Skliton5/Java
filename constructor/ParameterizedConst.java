package constructor;

public class ParameterizedConst {
	
	ParameterizedConst (int i,int j){
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		ParameterizedConst p = new ParameterizedConst(100, 200);
	}

}
