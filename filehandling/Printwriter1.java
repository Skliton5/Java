package filehandling;

import java.io.PrintWriter;

public class Printwriter1 {

	public static void main(String[] args) throws Exception{
		PrintWriter pw = new PrintWriter("f1.txt");
		pw.write("Welcome to Spiti Velly");
		pw.flush();
		pw.close();
	}

}
