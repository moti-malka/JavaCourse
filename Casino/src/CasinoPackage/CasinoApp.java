package CasinoPackage;

public class CasinoApp {

	public static void main(String[] args) {

		// create 3 new player object
		Player motim = new Player("3049940007", "motim");
		Player nehora = new Player("0523644755", "nehora");
		Player david = new Player("5555555", "david");

		// create 3 new CardsDealer object
		CardsDealer Delaer1 = new CardsDealer("123456", "bos", 3, 30);
		CardsDealer Delaer2 = new CardsDealer("123456", "mafia", 3, 55);
		CardsDealer Delaer3 = new CardsDealer("123456", "al pachino", 3, 24);

		// add players to lists in Delyer1
		Delaer1.addPlayerToList(motim);
		Delaer1.addPlayerToList(nehora);
		Delaer1.addPlayerToList(david);

		// add players to lists in Delyer2
		Delaer2.addPlayerToList(motim);
		Delaer2.addPlayerToList(nehora);
		Delaer2.addPlayerToList(david);

		// add players to lists in Delyer3
		Delaer3.addPlayerToList(motim);
		Delaer3.addPlayerToList(nehora);
		Delaer3.addPlayerToList(david);

		// Delaers deal cards to Players
		Delaer1.ableToDeal(10, "motim");
		Delaer2.ableToDeal(55, "david");
		Delaer3.ableToDeal(15, "nehora");

		System.out.println(Delaer1.toString());
		System.out.println(Delaer3.toString());
		System.out.println(Delaer2.toString());

		// show details of all players
		System.out.println(motim.toString());
		System.out.println(david.toString());
		System.out.println(nehora.toString());

		//test deal cards over invatory
		Delaer2.ableToDeal(55, "david");
		
		
		// create a 3 AddictedPlayer
		AddictedPlayer sami = new AddictedPlayer("52585", "sami");
		AddictedPlayer popo = new AddictedPlayer("123456", "popo");
		AddictedPlayer yosef = new AddictedPlayer("12548444", "yosef");
		AddictedPlayer rami = new AddictedPlayer("52585", "rami");

		// create a 3 DrugsDealer
		DrugsDealer Or = new DrugsDealer("5252111", "Or", 3, 50);
		DrugsDealer tom = new DrugsDealer("854582", "tom", 3, 90);
		DrugsDealer ori = new DrugsDealer("11444555", "avi", 3, 0);

		// add the addictedPlayer to list
		Or.addictedPlayer(sami);
		tom.addictedPlayer(popo);
		ori.addictedPlayer(yosef);

		// deal the Drags to addictedPlayer
		Or.ableToDeal(10, "sami");
		tom.ableToDeal(15, "popo");
		ori.ableToDeal(21, "yosef");

		// show details of all players
		System.out.println(sami.toString());
		System.out.println(yosef.toString());
		System.out.println(rami.toString());

		// show details of all DragsDealer
		System.out.println(Or.toString());
		System.out.println(tom.toString());
		System.out.println(ori.toString());

	}

}
