package CasinoPackage;

public class AddictedPlayer extends Player implements Consumer {

	private final String type = "AddictedPlayer";
	private int drugsGrams;

	public AddictedPlayer(String id, String name) {
		super(id, name);
		this.drugsGrams = 0;
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
	public void ableToConsumer(int GrasToBay) {
		this.drugsGrams = GrasToBay;
	}

	public float grasExists() {
		return drugsGrams;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + '\n' + "ID: " + getId() + '\n' + "Type :"
				+ type +'\n' + "SumDrugs: " + drugsGrams + '\n';
	}

}
