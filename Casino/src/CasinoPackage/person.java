package CasinoPackage;

public class person {

	private final String id;
	private String name;

	public person(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Name: " + name + '\n' + "ID: " + id;
	}

}
