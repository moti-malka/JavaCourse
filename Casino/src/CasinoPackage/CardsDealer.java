package CasinoPackage;

import java.util.Arrays;

public class CardsDealer extends person implements Dealer {

	private Player[] playersToDeal;
	private int SumOfCards;
	private int NextCell = 0;

	public CardsDealer(String id, String name, int SumOfPlayers, int SumOfCards) {
		super(id, name);
		playersToDeal = new Player[SumOfPlayers];
		this.SumOfCards = SumOfCards;

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
		if (this.SumOfCards == 0) {
			System.out
					.println("the CardsDelear " + this.getName() + " Cannot Deal Cards, The inventory is over" + '\n');
			return;
		} else if (SumOfCards > this.SumOfCards) {
			SumOfCards = SumOfCards - (SumOfCards % this.SumOfCards);

		}
		for (int i = 0; i < playersToDeal.length; i++) {
			if (this.playersToDeal[i].getName().equals(playerToDeal)) {

				this.playersToDeal[i].ableToConsumer(SumOfCards);
				this.SumOfCards -= SumOfCards;
				return;
			}

		}

	}

	public void addPlayerToList(Player playerName) {
		if (NextCell >= playersToDeal.length) {
			System.out.println("cannot add " + playerName.getName() + " to list the list is a full" + '\n');
		} else {
			this.playersToDeal[NextCell] = playerName;

			NextCell++;

		}

	}

	@Override
	public String toString() {
		return "         - CardsDealer " + getName() + " list -" + '\n' + "CardsDealer name: " + getName() + '\n'
				+ "Cards inventory After Deal :" + SumOfCards + '\n' + "All Player: "
				+ Arrays.toString(this.playersToDeal) + "  " + '\n';

	}
}