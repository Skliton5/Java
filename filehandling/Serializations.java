package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializations implements Serializable{
	int id;
	String name;

	public static void main(String[] args) throws Exception{
		Serializations sr = new Serializations();
		sr.id=101;
		sr.name="liton";
		FileOutputStream fos = new FileOutputStream("Serializations.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sr);
		oos.flush();
		oos.close();
		System.out.println("Serialization Completed");
		
		
		FileInputStream fis = new FileInputStream("Serializations.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Serializations se = (Serializations) object;
		System.out.println("Id : " + se.id);
		System.out.println("Name : " + se.name);
		ois.close();
		System.out.println("De-Serialization Completed");
		
	}

}
