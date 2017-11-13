package garagePackage;

public class Vehicles {
	protected int wheels;
	private String engineVolume;
	private int licenseNumber;
	protected String dateCheck;
	protected String checkOil;

	/*
	 * Constructor to create new Vehicles parameter : String number of wheels &
	 * String Volume of engine String license number
	 */
	public Vehicles(int wheels, String engineVolume, int licenseNumber) {

		this.wheels = wheels;
		this.engineVolume = engineVolume;
		this.licenseNumber = licenseNumber;
	}

	public void RoutineTreatment(String dateCheck) {
		this.dateCheck = dateCheck;
		this.checkOil = "Oil was treated";

	}
	
	

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public String getDateCheck() {
		return dateCheck;
	}


	@Override
	public String toString() {
		return "Vehicles wheels=" + wheels + ", engineVolume=" + engineVolume + ", licenseNumber=" + licenseNumber
				+ ", dateCheck=" + dateCheck + ", checkOil=" + checkOil + "";
	}

}
