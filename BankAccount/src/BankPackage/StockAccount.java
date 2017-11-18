package BankPackage;

import java.util.*;;

public class StockAccount extends RegularAccount {

	private int COD;
	private int COW;
	private int Bonus;
	private int randomCODW;

	Random random = new Random();

	public StockAccount(String clientID) {
		super(clientID);

	}
	@Override
	public void deposit(double sumDeposit) {
		this.COD = getRandomGenerate();
		this.Bonus = this.COD;
		super.deposit(sumDeposit - 1 + (this.COD + getBonus()));

	}
	@Override
	public void withdraw(double sumWithdraw) {
		this.COW = getRandomGenerate();
		this.Bonus = this.COW;
		super.withdraw(sumWithdraw - (this.COW - getBonus()));
	}

	public int getRandomGenerate() {
		Random random = new Random();
		randomCODW = random.nextInt(5);
		return randomCODW;

	}

	public int getBonus() {
		return Bonus;
	}

}
