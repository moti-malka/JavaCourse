package BankPackage;

public class ManageBankAccount {

	public static void main(String[] args) {

		StockAccount Moti = new StockAccount("0505758244");
		
		System.out.println(Moti.toString());
		
		Moti.deposit(2);
		
		System.out.println(Moti.toString());
		
		Moti.withdraw(10);
		System.out.println(Moti.toString());
		
	}

}
