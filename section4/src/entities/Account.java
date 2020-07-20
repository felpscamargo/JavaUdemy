package entities;

public class Account {

	private int number;
	private String name;
	private double value;
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void deposit(double amount) {
		value += amount;
	}
	
	public void withdraw(double amount) {
		value -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", value);
	}
}
