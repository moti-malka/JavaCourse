package CasinoPackage;

import java.util.Arrays;

public class DrugsDealer extends person implements Dealer {

	private AddictedPlayer[] addictedPlayer;
	private int SumDrags;
	private int NextCell = 0;

	public DrugsDealer(String id, String name, int SumOfaddictedPlayer, int inventoryDrags) {
		super(id, name);
		this.addictedPlayer = new AddictedPlayer[SumOfaddictedPlayer];
		SumDrags = inventoryDrags;
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
	public void ableToDeal(int SumOfDrags, String playerToDeal) {
		if (this.SumDrags == 0) {
			System.out.println("the DragsDelear " + this.getName() + " Cannot Deal Drags, The inventory is over");
			return;
		} else if (SumOfDrags > this.SumDrags) {
			SumOfDrags = SumOfDrags - (SumOfDrags % this.SumDrags);
		}
		for (int i = 0; i < addictedPlayer.length; i++) {
			
			if (this.addictedPlayer[i].getName().equals(playerToDeal)) {

				this.addictedPlayer[i].ableToConsumer(SumOfDrags);
				this.SumDrags -= SumOfDrags;
				return;
			}

		}

	}

	public void addictedPlayer(AddictedPlayer addictedPlayerName) {
		if (NextCell >= addictedPlayer.length) {
			System.out.println("cannot add " + addictedPlayerName.getName() + " to list the list is a full");
		} else {
			this.addictedPlayer[NextCell] = addictedPlayerName;
			NextCell++;

		}

	}

	@Override
	public String toString() {
		return "         - DrugsDealer " + getName() + " list -" + '\n' + "DrugsDealer name: " + getName() + '\n'
				+ "Drags inventory After sale :" + SumDrags + '\n' + "All addictedPlayer: "
				+ Arrays.toString(addictedPlayer);

	}

}
