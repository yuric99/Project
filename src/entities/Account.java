package entities;

public class Account {

	private final double tax = 5.0;
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}

	public Account(int accountNumber, String accountHolder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialBalance);

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return accountBalance;

	}

	public void deposit(double value) {
		accountBalance += value;

	}

	public void withdraw(double value) {
		accountBalance -= (value + tax);

	}

	public String toString() {

		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ accountHolder 
				+ ", Balance = $ "
				+ String.format("%.2f", accountBalance);

	}

}
