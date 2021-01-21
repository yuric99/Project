package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What's the dollar price? $");
		double dolarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? $");
		double dolarAmmount = sc.nextDouble();
		System.out.printf("Ammount to be paid in Reais = R$%.2f", CurrencyConverter.Converter(dolarPrice, dolarAmmount));

		sc.close();
	}

}
