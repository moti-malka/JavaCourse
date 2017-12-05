package CasinoPackage;

public class CasinoApp {

	public static void main(String[] args) {
		
		// create 3 new player object
		Player motim = new Player("3049940007", "motim");
		Player nehora = new Player("0523644755", "nehora");
		Player david = new Player("5555555", "david");
		
		// create 3 new CardsDealer object
		CardsDealer Delaer1 = new CardsDealer("123456", "bos", 3);
		CardsDealer Delaer2 = new CardsDealer("123456", "bos", 3);
		CardsDealer Delaer3 = new CardsDealer("123456", "bos", 3);
		
		// add players to lists in cardsdealers
		Delaer1.addPlayerToList(motim);
		Delaer1.addPlayerToList(nehora);
		Delaer1.addPlayerToList(david);
		//System.out.println(Delaer1.toString());
		
		
		Delaer2.addPlayerToList(motim);
		Delaer2.addPlayerToList(nehora);
		Delaer2.addPlayerToList(david);
		//System.out.println(Delaer2.toString());
		
		Delaer3.addPlayerToList(motim);
		Delaer3.addPlayerToList(nehora);
		Delaer3.addPlayerToList(david);
		//System.out.println(Delaer3.toString());
		
		//deal cards to players
		
		
		
		// create 3 new AddictedPlayer object
		AddictedPlayer sami = new AddictedPlayer("52585", "sami");
		AddictedPlayer rami = new AddictedPlayer("66669", "rami ");
		AddictedPlayer moshe = new AddictedPlayer("8484848", "moshe");

		// create 3 new DrugsDealer object
		DrugsDealer Or = new DrugsDealer("5252111", "Or", 5);
		DrugsDealer chen = new DrugsDealer("00000", "chen ", 5);
		DrugsDealer lior = new DrugsDealer("587777", "lior", 5);
		
		// create 3 new DrugsDealer object
		Or.addictedPlayer(sami);
		Or.addictedPlayer(rami);
		Or.addictedPlayer(moshe);
		System.out.println(Or.toString());
		
		chen.addictedPlayer(sami);
		chen.addictedPlayer(rami);
		chen.addictedPlayer(moshe);
		//System.out.println(chen.toString());
		
		lior.addictedPlayer(sami);
		lior.addictedPlayer(rami);
		lior.addictedPlayer(moshe);
	//	System.out.println(lior.toString());
		
		

	}

}
