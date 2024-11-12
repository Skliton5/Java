package oops_;

public class Test1 {

	public static void main(String[] args) {
		Account a= new Account();
		a.setAccNum(1001);
		a.setName("liton");
		
	int	accNum = a.getAccNum();
		String name = a.getName();
		System.out.println(accNum+"____"+name);
	}

}
