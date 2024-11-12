package filehandling;

import java.io.File;

public class File1 {

	public static void main(String[] args)throws Exception {
		File f= new File("C:\\Users\\liton\\OneDrive\\Documents\\Java\\JavaProgram\\Liton");
			
		 f.createNewFile();
		String[] arr= f.list();
		 for(String n:arr) {
			File f1= new File(f,n);
			if(f1.isFile()) {
				System.out.println("File::"+n);
			}if(f1.isDirectory()) {
				System.out.println("Directory::"+ n);
			}else {
				System.out.println("");
			}
		 }
		
	}

}
