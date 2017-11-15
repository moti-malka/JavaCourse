package BankPackage;

public class RegularAccount {

	private final String clientID;
	private double balance;
	protected int COW;
	protected int COD;

	public RegularAccount(String clientID) {
		this.balance = 0;
		this.clientID = clientID;
		COW = 3;
		COD = 1; 

	}

	public String getClientID() {
		return clientID;
	}

	public double getBalance() {
		return balance;
	}
 
	public void deposit(Double sumTodeposit) {
		this.balance += (sumTodeposit + this.COD);
	}

	public void withdraw(Double sumwithdraw) {
		this.balance -= sumwithdraw - this.COW;
	}

	@Override
	public String toString() {
		return "Your ID: " + clientID + '\n' + "your balance: "  + balance;
	}
	
	

}
