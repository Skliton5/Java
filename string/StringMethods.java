package string;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Sambit";
		String s2 = "Liton";
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.replace("it","ta"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.substring(0,3));
		String s3= "yo@sambit";
		System.out.println(s3.split("@"));
		System.out.println(s1.startsWith("it"));
		System.out.println(s2.endsWith("on"));
		String s4= "    yo     ";
		System.out.println(s4.trim());
		int a=20;
		int b =25;
		System.out.println(String.valueOf(a) + String.valueOf(b));
		String s5="Liton";
		char ch []= s5.toCharArray();
		System.out.println(ch);
	}

}
