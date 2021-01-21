package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> person = new ArrayList<>();

		System.out.print("Please enter the number of people you want to register: ");
		int register = sc.nextInt();
		System.out.println();
		sc.nextLine();

		//Register info. 
		for (int i = 0; i < register; i++) {

			System.out.println("Person " + (i + 1));
			System.out.print("Please insert the name: ");
			String name = sc.nextLine();
			name.trim();

			//Verify if the name already exists. 
			if (Person.hasName(person, name)) {
				while (Person.hasName(person, name)) {
					System.out.println();
					System.out.println("Name's already registered. Please insert another one.");
					System.out.print("Please insert the name: ");
					name = sc.nextLine();
					name.trim();
				}
			}

			System.out.print("Please insert the CPF: ");
			String cpf = sc.nextLine();
			cpf.trim();
			
			//Verify if CPF already exists.
			if (Person.hasCpf(person, cpf)) {
				while (Person.hasCpf(person, cpf)) {
					System.out.println();
					System.out.println("CPF's already registered. Please insert another one.");
					System.out.print("Please insert the CPF: ");
					cpf = sc.nextLine();
					cpf.trim();
				}
			}

			System.out.print("Please insert the sex: ");
			String sexo = sc.nextLine();
			sexo.trim();
			
			/*Verify if the sex information inserted is valid, 
			preventing invalid data being inserted into the register information.*/
			int sexVerification = Person.validSex(sexo);
			if (sexVerification == 1) {
				while (sexVerification == 1) {
					System.out.println();
					System.out.println("Invalid sex, please try again.");
					System.out.print("Please insert the sex: ");
					sexo = sc.nextLine();
					sexVerification = Person.validSex(sexo);
					sexo.trim();
				}
			}

			System.out.print("Please insert the age: ");
			Short age = sc.nextShort();
			sc.nextLine();
			System.out.println();
			
			//Instantiate the data into the list.
			person.add(new Person(name, cpf, sexo, age));
		}

		System.out.println("Press ENTER to Continue.");
		sc.nextLine();

		//Verify a specific person's info.
		System.out.print("Please insert the CPF of the person you wish to see the info: ");
		String cpfVerify = sc.nextLine();
		cpfVerify.trim();

		Person verifyPersonCpf = person.stream().filter(x -> x.getCpf().equals(cpfVerify)).findFirst().orElse(null);
		
		if (verifyPersonCpf == null) {
			System.out.println("There's no person registered with the CPF " + cpfVerify);
			System.out.println();
		
		} else {
			System.out.println();
			System.out.println("Here's the data: ");
			System.out.println(person.get(person.indexOf(verifyPersonCpf)).toString());

		}

		System.out.println("Press ENTER to continue.");
		sc.nextLine();

		//Show all the information inserted in the list.
		System.out.println("Here's all the people registered:");
		System.out.println();
		
		for (Person personList : person) {
			System.out.println("Person " + (person.indexOf(personList) + 1));
			System.out.println(personList);
		}

		System.out.println("Press enter to FINISH.");
		sc.nextLine();

		sc.close();
	}

}
