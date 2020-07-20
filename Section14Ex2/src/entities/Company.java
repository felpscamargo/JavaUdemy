package entities;

public class Company extends TaxPayer{

	private int numberofEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double anualIncome, int numberofEmployees) {
		super(name, anualIncome);
		this.numberofEmployees = numberofEmployees;
	}

	public int getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(int numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

	@Override
	public Double tax() {
		Double total = 0.0;
		
		if(numberofEmployees < 10) {
			total = getAnualIncome() * 0.16;
		}
		
		else {
			total = getAnualIncome() * 0.14;
		}
		
		return total;
	}
}
