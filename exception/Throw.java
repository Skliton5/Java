package exception;

public class Throw {

	public String getName(int id)throws Exception{
		if(id==100) {
			return "liton";
		}else if(id==200) {
			return "Ani";
		}else {
			throw new Exception("Invalid ID");
		}
	}
	public static void main(String[] args)throws Exception {
		Throw t = new Throw();
		String name=t.getName(100);
		 System.out.println(name);
		  String name1 = t.getName(400);
		  System.out.println(name1);
	}
}
