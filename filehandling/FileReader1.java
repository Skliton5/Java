package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("Ani.txt");
		BufferedReader br = new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);	
			s= br.readLine();
		}
		
	}

}
