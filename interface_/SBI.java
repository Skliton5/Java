package interface_;

public class SBI implements Bank{
	
	public void checkBalance() {
		System.out.println("Balance Checked");
		
	}
	public void moneyTransfor() {
		System.out.println("Money Transford");
		
	}
	public static void main(String[] args) {
		SBI Sb = new SBI();
		Sb.checkBalance();
		Sb.moneyTransfor();
	}

}
