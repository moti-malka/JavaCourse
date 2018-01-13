package CasinoPackage;

import java.util.Arrays;

public class Santa extends person implements Dealer {

	private Player[] ListOfPlayers;
	private int SumOftoys;
	private int NextCell = 0;

	public Santa(String id, String name, int SumOfToys, int listOfPlayers) {
		super(id, name);
		this.SumOftoys = SumOfToys;
		this.ListOfPlayers = new Player[listOfPlayers];
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
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
	public void ableToDeal(int SumOfToys, String playerToDeal) {
		if (this.SumOftoys == 0) {
			System.out.println("the Santa " + this.getName() + " Cannot Deal Toys, The inventory is over");
			return;
		} else if (SumOfToys > this.SumOftoys) {
			SumOfToys = SumOfToys - (SumOfToys % this.SumOftoys);
		}
		for (int i = 0; i < ListOfPlayers.length; i++) {

			if (this.ListOfPlayers[i].getName().equals(playerToDeal)) {

				this.ListOfPlayers[i].ableToConsumer(SumOfToys);
				this.SumOftoys -= SumOfToys;
				return;
			}

		}

	}

	public void addPlayrToLIst(Player PlayerName) {
		if (NextCell >= ListOfPlayers.length) {
			System.out.println("cannot add " + PlayerName.getName() + " to list the list is a full");
		} else {
			this.ListOfPlayers[NextCell] = PlayerName;
			NextCell++;

		}

	}

	@Override
	public String toString() {
		return "         - Santa " + getName() + " list -" + '\n' + "Santa name: " + getName() + '\n'
				+ "Toys inventory After Deal :" + SumOftoys + '\n' + "All Player: " + Arrays.toString(ListOfPlayers);

	}
}