package BankPackage;

public class business extends RegularAccount {

	private int COW;
	private int COD;
	private int depositNumber = 0;

	public business(String clientID) {
		super(clientID);
		this.COW = 1;
		this.COD = 1;

	}

	public void deposit(double sumDiposit) {
		this.depositNumber++;
		if (this.depositNumber == 10 || this.depositNumber >= 20 ) {
			this.COD++;
		}
		if (this.COD == 7) {
			this.depositNumber = 0;
			this.COD = 1;
		}

		super.deposit(sumDiposit + this.COD - 1);
		System.out.println(getBalance());
	}

	public void withdraw(Double sumwithdraw) {
		super.withdraw(sumwithdraw - this.COW);

	}

}
