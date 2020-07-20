package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();
		
		if(num < 0.00 || num > 100.00) {
			System.out.println("Fora do Intervalo");
		}
		else if(num <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if(num <= 50.00) {
			System.out.println("Intervalo [25,50]");
		}
		else if(num <= 75.00 && num <= 100.00) {
			System.out.println("Intervalo [50,75]");
		}
		else {
			System.out.println("75,100");
		}
		
		sc.close();
	}

}
