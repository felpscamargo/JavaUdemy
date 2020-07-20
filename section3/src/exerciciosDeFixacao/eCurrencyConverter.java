package exerciciosDeFixacao;

public class eCurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double amount, double dollarPrice) {	
		return amount * dollarPrice * (1.0 + IOF); 
	}

}
