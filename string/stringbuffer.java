package string;

public class stringbuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello");
		sb.append("yo");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("hi");
		System.out.println(sb1.reverse());
		
		String s1="Liton";
		s1.concat("it");
		System.out.println(s1);
		
	}

}
