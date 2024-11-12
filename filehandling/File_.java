package filehandling;
import java.io.File;
import java.io.IOException;

public class File_ {

	public static void main(String[] args)throws Exception {
		File f12 = new File("hoo");
		boolean b=f12.createNewFile();
		System.out.println(b);
		
		File f1= new File("MyWork");
		boolean b1=f1.mkdir();
		System.out.println(b1);
		
		File f2= new File(f1,"hi.txt");
		boolean b2=f2.createNewFile();
		System.out.println(b2);
		
		File f3= new File("MyWork");
		String[] arr=f3.list();
		for(String n:arr) {
			System.out.println(n);
		}
		File f4= new File("C:\\Users\\liton\\OneDrive\\Documents\\Java\\JavaProgram\\Liton");
		String[] name=f4.list();
		for(String s:name) {
			System.out.println(s);
		}
		File f5 = new File("Hio.txt");
		f5.createNewFile();
		f5.delete();
		
	}
}
