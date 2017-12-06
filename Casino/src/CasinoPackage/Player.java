package CasinoPackage;

public class Player extends person implements Consumer {

	private final String type = "player";
	private int card;

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
	public void ableToConsumer(int consumer) {
		this.card = consumer;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + '\n' + "Type :" + this.type +'\n' + "Cards :" + card + '\n';
	}


}
