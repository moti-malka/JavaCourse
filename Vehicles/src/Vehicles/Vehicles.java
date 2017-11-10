package Vehicles;

public class Vehicles {

	private String manufacturer;
	private String model;
	private int Year;

	public Vehicles(String manufacturer, String model, int year) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.Year = year;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "Vehicles [manufacturer=" + manufacturer + ", model=" + model + ", Year=" + Year + "]";
	}
	
	

}
