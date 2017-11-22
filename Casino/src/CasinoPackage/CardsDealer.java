package CasinoPackage;

public class CardsDealer extends person implements Dealer {

	public CardsDealer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void ableToDeal(int listOfPlayers) {
		Player[] players = new Player[listOfPlayers];
		for (Player player : players) {
			System.out.println("deal card to : " + player);
			
		}
	}

}
