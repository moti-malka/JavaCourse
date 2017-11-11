package garagePackage;

import java.util.Arrays;

public class garage {

	private Vehicles[] garage;
	private int nextCell;

	public garage() {
		this.garage = new Vehicles[15];
	}

	public void addCarToGarage(String engineVolume, int licenseNumber, String color) {
		if (nextCellFree() != -1) {
			garage[nextCellFree()] = new Car(engineVolume, licenseNumber, color);
		} else {
			System.out.println("ne ceel free");
		}

	}

	public int nextCellFree() {
		this.nextCell = -1;
		for (int i = 0; i < garage.length; i++) {
			if (this.garage[i] == null) {
				this.nextCell = i;
				i = garage.length;

			}

		}
		return this.nextCell;

	}

	
	@Override
	public String toString() {
		return "garage [garage=" + Arrays.toString(garage) + "]";
	}

}
