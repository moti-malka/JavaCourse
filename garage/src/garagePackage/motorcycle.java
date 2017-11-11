package garagePackage;

public class motorcycle extends Vehicles {
	private static int wheels = 2;
	private int speedMax;
	
	
	public motorcycle(int wheels, String engineVolume, int licenseNumber, int speedMax) {
		super(wheels, engineVolume, licenseNumber);
		this.speedMax = speedMax;

	}


	@Override
	public String toString() {
		return super.toString() + "motorcycle [speedMax=" + speedMax + "]";
	}
	
	
	

	
	

}
