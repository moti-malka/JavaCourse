package BankPackage;

public class RegularAccount {

	protected final String clientID;
	private double balance; 
	private int COW = 3;
	private int COD = 1;
	private final int bonus = 0;


	public RegularAccount(String clientID) {
		this.balance = 0;
		this.clientID = clientID;

	}

	public int getBonus() {
		return bonus;
	}
	public String getClientID() {
		return clientID;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double sumTodeposit) {
		this.balance += (sumTodeposit + COD);
	}

	public void withdraw(double sumwithdraw) {
		
		this.balance -= (sumwithdraw + this.COW);
		
	}

	@Override
	public String toString() {
		return "Your ID: " + clientID + '\n' + "your balance: " + getBalance();
	}

}
