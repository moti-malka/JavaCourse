package PackegesBank;

public class BankAccount {
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftSum;

	// Default Constructor to nullify account
	private void BankAccount() {
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	// Constractor create new client
	public void BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,double overDraftSum) {
		this.accountName = accountName;
		this.accountName = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftSum = overDraftSum;
	}

	// deposit metod
	public void deposit(double depositAmount) {
		while (depositAmount < 0) {
			System.out.println("the amount " + depositAmount + " it is incorrect");
		}
		balance += depositAmount;
		System.out.println("the balance is : " + balance);

	}
/*
	// withdrawal metod
	public void withdrawal(double withdrawal) {
		while (withdrawal < 0) {
			System.out.println("the withdrawal " + withdrawal + " it is incorrect");
		}
*/
	}


