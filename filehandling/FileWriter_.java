package filehandling;

import java.io.FileWriter;

public class FileWriter_ {

	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("Ani.txt");
		fw.write("Welcome to Spiti Velly");
		fw.write("\n");
		fw.write("Welcome to India`s Chardham");
		fw.flush();
		fw.close();
	}

}
