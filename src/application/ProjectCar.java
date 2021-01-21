package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;

public class ProjectCar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Select the number of cars.
		System.out.print("How many cars would you like to register? ");
		int reg = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		Car[] car = new Car[reg];

		// Register car informations.
		for (int i = 0; i < reg; i++) {

			System.out.print("Please enter the car #" + (i + 1) + " brand: ");
			String carBrand = sc.nextLine();

			System.out.print("Please enter the car #" + (i + 1) + " name: ");
			String carName = sc.nextLine();

			System.out.print("Please enter the car #" + (i + 1) + " color: ");
			String carColor = sc.nextLine();

			System.out.print("Please enter the car #" + (i + 1) + " year: ");
			short carYear = sc.nextShort();

			System.out.print("Pelase enter the car #" + (i + 1) + " engine horse power: ");
			short carPower = sc.nextShort();

			System.out.print("Please enter the car #" + (i + 1) + " price: $");
			double carPrice = sc.nextDouble();
			sc.nextLine();

			System.out.println("");

			car[i] = new Car(carBrand, carName, carColor, carYear, carPower, carPrice);
		}

		// Show specific car information
		String conf = "Yes";

		while (conf.charAt(0) == 'Y' || conf.charAt(0) == 'y') {
			System.out.print("Please insert the car number you wish to see the info: ");
			int carReg = sc.nextInt();
			sc.nextLine();
			carReg--;
			System.out.println("");
			System.out.println("Here's car number " + (carReg + 1) + " info: ");
			System.out.println(car[carReg].showCarInfo(carReg));
			System.out.print("Would you like to see another car's info (Yes/No)? ");
			conf = sc.next();
			sc.nextLine();
			System.out.println("");
		}

		// Show all registered cars
		System.out.print("Would you like to see all the registered cars(Yes / No)? ");
		String finalReg = sc.next();
		sc.nextLine();
		System.out.println("");

		if (finalReg.charAt(0) == 'Y' || finalReg.charAt(0) == 'y') {

			for (int i = 0; i < reg; i++) {

				System.out.println("Car number " + (i + 1) + " info: ");
				System.out.println(car[i].showCarInfo(i));
			}
		}
		sc.close();
	}
}
