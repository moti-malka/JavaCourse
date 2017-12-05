package CasinoPackage;

import java.util.Arrays;

public class CardsDealer extends person implements Dealer {

	private Player[] playersToDeal;

	public CardsDealer(String id, String name, int SumOfPlayers) {
		super(id, name);
		playersToDeal = new Player[SumOfPlayers];

	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	public void dealCards(int NumOfCard) {
		ableToConsumer()

	}

	public void addPlayerToList(Player playerName) {
		int nextcell = nextCell();
		if (nextcell == -1) {
			System.out.println("the list is a full");
		} else {
			this.playersToDeal[nextcell] = playerName;
			
		}

	}

	private int nextCell() {
		int next = -1;
		for (int i = 0; i < this.playersToDeal.length; i++) {
			if (this.playersToDeal[i] == null) {
				next = i;
			}

		}
		return next;
	}
	
	public void name() {
		
	}

	@Override
	public void ableToDeal(int listOfPlayers) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return  Arrays.toString(playersToDeal) + "]";
	}

}
