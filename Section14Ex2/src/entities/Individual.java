package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() {
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double SetHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void GetHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double total = 0.0;
		
		if(getAnualIncome() < 20000) {
			total = getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		
		else{
			total = getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
		
		return total;
	}
}
