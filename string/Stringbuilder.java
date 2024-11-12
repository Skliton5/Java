package string;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.length());
		sb.append("yo");
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
