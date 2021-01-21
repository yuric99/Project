package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program0 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Please insert the number of people to be registered: ");
		int register = sc.nextInt();
		sc.nextLine();
		System.out.println();

		Person[] person = new Person[register];

		// People registration
		for (int i = 0; i < register; i++) {

			System.out.println("Person " + (i + 1));
			System.out.print("Please insert the name: ");
			String name = sc.nextLine();
			name.trim();

			System.out.print("Please insert the CPF (Only numbers): ");
			String cpf = sc.nextLine();
			cpf.trim();

			System.out.print("Please insert the sex: ");
			String sexo = sc.nextLine();
			sexo.trim();

			int sexValidation = Person.validSex(sexo);
			if (sexValidation == 1) {
				while (sexValidation == 1) {
					System.out.println("Invalid sex, please try again.");
					System.out.print("Please insert the sex: ");
					sexo = sc.nextLine();
					sexo.trim();
					sexValidation = Person.validSex(sexo);
				}
			}

			System.out.print("Please insert the age: ");
			short age = sc.nextShort();
			sc.nextLine();
			System.out.println();

			person[i] = new Person(name, cpf, sexo, age);
		}
		System.out.print("Press enter to continue.");
		sc.nextLine();

		// Verify Registered Info

		System.out.println("Here's all the people registered: ");
		System.out.println();

		for (int i = 0; i < register; i++) {
			System.out.println("Person " + (i + 1));
			System.out.println(person[i]);

		}

		System.out.print("Press enter to continue.");
		sc.nextLine();
		System.out.println();
		String sexVerification;
		short ageVerification;
		int Quant = 0; // Countable attribute.

		// Male People

		System.out.println("Here's all the male people registered: ");
		System.out.println("");

		for (int i = 0; i < register; i++) {

			sexVerification = Person.verifySex(person[i].getSexo());
			if (sexVerification == "1") {
				System.out.println(person[i]);
				Quant++;
			}

		}
		if (Quant == 0) {
			System.out.println("There's No Male People Registered.");
		}

		System.out.print("Press enter to continue.");
		sc.nextLine();
		System.out.println();

		// Female People

		System.out.println("Here's all the Female people registered: ");
		System.out.println("");

		Quant = 0;
		for (int i = 0; i < register; i++) {

			sexVerification = Person.verifySex(person[i].getSexo());
			if (sexVerification == "0") {
				System.out.println(person[i]);
				Quant++;
			}

		}
		if (Quant == 0) {
			System.out.println("There's No Female People Registered.");
		}
		

		System.out.print("Press enter to continue.");
		sc.nextLine();
		System.out.println();

		// Over Age

		System.out.println("Here's all the over age people registered: ");
		System.out.println("");
		
		Quant = 0;
		for (int i = 0; i < register; i++) {

			ageVerification = Person.verifyAge(person[i].getAge());
			if (ageVerification == 1) {
				System.out.println(person[i]);
				Quant++;
			}

		}
		if (Quant == 0) {
			System.out.println("There's No Over Age People Registered.");
		}
		

		System.out.print("Press enter to continue.");
		sc.nextLine();
		System.out.println();

		// Under Age

		System.out.println("Here's all the under age people registered: ");
		System.out.println("");

		Quant = 0;
		for (int i = 0; i < register; i++) {

			ageVerification = Person.verifyAge(person[i].getAge());
			if (ageVerification == 0) {
				System.out.println(person[i]);
				Quant++;
			}

		}
		if (Quant == 0) {
			System.out.println("There's No Under Age People Registered.");
		}
		
		Quant = 0;

		System.out.print("Press enter to finish the program.");
		sc.nextLine();
		System.out.println();
		sc.close();
	}

}
