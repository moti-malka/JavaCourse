package garagePackage;

import java.util.Scanner;

public class Appgarage {

	
	public static void main(String[] args) {
		
		garage motiGarage = new garage();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("engineVolume: ");
		String engineVolume = scanner.nextLine();
		
		System.out.print("licenseNumber: ");
		int licenseNumber = scanner.nextInt();
		
		System.out.print("color: ");
		
		String color = scanner.nextLine();
		System.out.print("color: ");
		scanner.close();
		
		//motiGarage.addCarToGarage(engineVolume, licenseNumber, color);

		//System.out.println(motiGarage.showVehicles(0));
		
		//motiGarage.checkRoutineTreatment(1234, "11/12/17"); 
		
		/*
		Car moti = new Car("1600", 123456, "red");
        System.out.println(moti.getLicenseNumber());
		*/
		
		
		
		
		
		
	}

}
