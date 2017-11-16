package BankPackage;

public class business extends RegularAccount {

	private int depositNumber;
	private int COD = 1;
	private int Bonus = 0;

	public business(String clientID) {
		super(clientID);

	}

	@Override
	public void deposit(double sumDiposit) {

		this.depositNumber++;

		int DN = this.depositNumber;
		if (DN == 11 || DN == 21 || DN == 31 || DN == 41 || DN == 51 || DN == 61 || DN == 71) {

			this.COD++;
		}
		if (this.COD == 7) {
			this.Bonus = 20 * this.COD;

			this.depositNumber = 0;
			this.COD = 1;
		} else {
			this.Bonus = 0;
		}

		super.deposit(sumDiposit + (COD - 1) + this.Bonus);

	}
	@Override
	public void withdraw(double sumwithdraw) {
		super.withdraw(sumwithdraw);

	}

	public int getBonus() {
		return this.Bonus;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
