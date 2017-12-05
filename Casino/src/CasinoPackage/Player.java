package CasinoPackage;

public class Player extends person implements Consumer {

	private static int card;

	public Player(String id, String name) {
		super(id, name);
		this.card = 0;

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
	public String toString() {
		return super.toString() + "Player [card=" + card + "]";
	}

	@Override
	public static void ableToConsumer(int numberOfCard) {
		card += numberOfCard;
	}

}
