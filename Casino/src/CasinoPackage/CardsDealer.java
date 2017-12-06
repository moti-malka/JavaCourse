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

	@Override
	public void ableToDeal(int SumOfCards, String playerToDeal) {
		for (int i = 0; i < playersToDeal.length; i++) {
			if (this.playersToDeal[i] == null) {
				i++;
			} else if (this.playersToDeal[i].getName().equals(playerToDeal)) {
				this.playersToDeal[i].ableToConsumer(SumOfCards);
			}
		}

	}

	public void addPlayerToList(Player playerName) {
		int nextcell = nextCell();
		if (nextcell == -1) {
			System.out.println("cannot add: " + playerName.getName() + " to list the list is a full");
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
	public String toString() {
		return Arrays.toString(playersToDeal) + "]";
	}

}
