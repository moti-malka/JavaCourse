package CasinoPackage;

public class DrugsDealer extends person implements Dealer {

	private AddictedPlayer[] addictedPlayer;

	public DrugsDealer(String id, String name, int SumOfaddictedPlayer) {
		super(id, name);
		this.addictedPlayer = new AddictedPlayer[SumOfaddictedPlayer];
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
		for (int i = 0; i < addictedPlayer.length; i++) {
			if (this.addictedPlayer[i] == null) {
				i++;
			} else if (this.addictedPlayer[i].getName().equals(playerToDeal)) {
				this.addictedPlayer[i].ableToConsumer(SumOfDrags);
			}
		}

	}

	public void addictedPlayer(AddictedPlayer addictedPlayerName) {
		int nextcell = nextCell();
		if (nextcell == -1) {
			System.out.println("cannot add " + addictedPlayerName.getName() + " to list the list is a flul ");
		} else {
			this.addictedPlayer[nextcell] = addictedPlayerName;

		}

	}

	private int nextCell() {
		int next = -1;
		for (int i = 0; i < this.addictedPlayer.length; i++) {
			if (this.addictedPlayer[i] == null) {
				next = i;
			}

		}
		return next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
