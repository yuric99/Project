package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double value = 0.0;
		Account acc;
		
		// Account Info Registration
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();

		System.out.print("Is there an initial deposit value(y/n)? ");
		String depositConfirmation = sc.nextLine();

		if (depositConfirmation.charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			acc = new Account(accountNumber, accountHolder, value);

		} else {

			acc = new Account(accountNumber, accountHolder);
		}

		// Account info
		System.out.println("");
		System.out.println("Account Data:");
		System.out.println(acc);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		acc.deposit(value);

		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println("");

		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		acc.withdraw(value);

		System.out.println("Updated account data: ");
		System.out.println(acc);

		sc.close();
	}

}
