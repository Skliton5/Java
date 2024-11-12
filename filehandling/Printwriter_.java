package filehandling;

import java.io.PrintWriter;

public class Printwriter_ {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Hello");
		pw.print("Helloooo");
		pw.flush();
		pw.close();
	}

}
