package garagePackage;

public class Car extends Vehicles {

	protected static int wheels = 4;
	private String Color;
	private String Switchwipers;

	public Car( String engineVolume, int licenseNumber, String color) {
		super(wheels, "1600", 1234);
		this.Color = color;
	}

	public void RoutineTreatment(String dateCheck) {
		this.dateCheck = dateCheck;
		this.checkOil = "Oil was treated";
		this.Switchwipers = "wipers was replaced";

	}

	@Override
	public String toString() {
		return super.toString() + '\n' + "Color=" + Color + ", Switchwipers=" + Switchwipers + "";
	}

}
