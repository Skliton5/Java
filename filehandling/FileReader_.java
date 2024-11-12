package filehandling;

import java.io.FileReader;

import loops.While;

public class FileReader_ {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("Ani.txt");
		int i=fr.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		
		
	}

}
