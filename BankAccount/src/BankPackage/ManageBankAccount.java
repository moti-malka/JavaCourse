package BankPackage;

public class ManageBankAccount {

	public static void main(String[] args) {

		business Rami = new business("123456");

		Rami.deposit(150);

		System.out.println(Rami.toString());
		
		Rami.withdraw(40);
		System.out.println(Rami.toString());
		Rami.withdraw(150);
		System.out.println(Rami.toString());
		Rami.deposit(80);
		System.out.println(Rami.toString());
		
		
	}

}
