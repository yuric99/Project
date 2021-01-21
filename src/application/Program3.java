package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered: ");
		int register = sc.nextInt();
		System.out.println();
		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < register; i++) {

			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			

			while (hasId(list, id)) {
				System.out.println("Id's already taken! Try again.");
				System.out.print("ID: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			list.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee ID that will have the salary increase: ");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println("");
		System.out.println("Employees List: ");

		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return (emp != null);

	}

}
