package CasinoPackage;

public class CasinoApp {

	public static void main(String[] args) {
		
		//create 3 new player object
		Player motim = new Player("3049940007", "motim");
		Player nehora = new Player("0523644755", "nehora");
		Player david = new Player("5555555", "david");
		Player pini = new Player("85422258", "pini");
		
		//create 3 new CardsDealer object
		CardsDealer Delaer1 = new CardsDealer("123456", "bos", 3);
		CardsDealer Delaer2 = new CardsDealer("123456", "mafia", 15);
		CardsDealer Delaer3 = new CardsDealer("123456", "al pachino", 25);
	
		
		//add players to lists in Delyer1
		Delaer1.addPlayerToList(motim);
		Delaer1.addPlayerToList(nehora);
		Delaer1.addPlayerToList(david);
		Delaer1.addPlayerToList(pini);
		
		
		//add players to lists in Delyer2
		Delaer2.addPlayerToList(motim);
		Delaer2.addPlayerToList(nehora);
		Delaer2.addPlayerToList(david);
		
		
		//add players to lists in Delyer3
		Delaer3.addPlayerToList(motim);
		Delaer3.addPlayerToList(nehora);
		Delaer3.addPlayerToList(david);
		
		
		//Delaers deal cards to Players
		Delaer1.ableToDeal(45, "motim");
		Delaer2.ableToDeal(8, "david");
		Delaer3.ableToDeal(15, "nehora");
		
		//show details of all players
		System.out.println(motim.toString());
		System.out.println(david.toString());
		System.out.println(nehora.toString());
		
		
		
		//create 3 new AddictedPlayer object
		AddictedPlayer sami = new AddictedPlayer("52585", "sami");
		AddictedPlayer rami = new AddictedPlayer("66669", "rami");
		AddictedPlayer moshe = new AddictedPlayer("8484848", "moshe");
		

		//create 3 new DrugsDealer object
		DrugsDealer Or = new DrugsDealer("5252111", "Or", 3);
		DrugsDealer chen = new DrugsDealer("00000", "chen ", 5);
		DrugsDealer lior = new DrugsDealer("587777", "lior", 5);
		
		
		//add addictedPlayer to lists in DrugsDelaer Or
		Or.addictedPlayer(sami);
		Or.addictedPlayer(rami);
		Or.addictedPlayer(moshe);
		
		
		
		//add addictedPlayer to lists in DrugsDelaer chen
		chen.addictedPlayer(sami);
		chen.addictedPlayer(rami);
		chen.addictedPlayer(moshe);
	
		
		//add addictedPlayer to lists in DrugsDelaer lior
		lior.addictedPlayer(sami);
		lior.addictedPlayer(rami);
		lior.addictedPlayer(moshe);
		
		
		//DragsDelaers deal Drags to addictedPlayer
		Or.ableToDeal(9, "sami");
		chen.ableToDeal(4, "rami");
		lior.ableToDeal(1, "moshe");

		
		//show details of all players
		System.out.println(sami.toString());
		System.out.println(moshe.toString());
		System.out.println(rami.toString());
		
		

	}

}
