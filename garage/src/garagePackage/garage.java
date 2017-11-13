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
			System.out.println("Ther is not ceel free in garage!!");
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

	public void checkRoutineTreatment(int licenseNumber, String dateCheck) {
		if (RoutineTreatment(licenseNumber, dateCheck) == true) {

			System.out.println("The RoutineTreatment Sucess");
		} else {
			System.out.println("The RoutineTreatment not Sucess!!");
		}

	}

	private boolean RoutineTreatment(int licenseNumber, String dateCheck) {
		int indec = 0;
		for (int i = 0; i < garage.length; i++) {

			int id = garage[i].getLicenseNumber();
			System.out.println(id);

			if (licenseNumber == garage[i].getLicenseNumber()) {

				garage[i].RoutineTreatment(dateCheck);
				indec = 1;

			}

		}

		if (indec == 1) {
			return true;
		} else {
			return false;
		}

	}

	public Vehicles showVehicles(int position) {
		return garage[position];
	}

	public String showGarage() {
		return "garage=" + Arrays.toString(garage) + "";
	}

}
