package entities;

public class CurrencyConverter {

	private static final double iof = 0.06;

	public CurrencyConverter() {
	}

	public static double Converter(double dolarValue, double dolarAmmount) {
		return (dolarValue * dolarAmmount) + ((dolarValue * dolarAmmount) * iof);
	}

}
