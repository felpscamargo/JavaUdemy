package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double val = 0;
		int n1 = sc.nextInt();
		int qtd = sc.nextInt();
		
		if(n1 == 1) {
			val = 4.00 * qtd;
		}
		else if(n1 == 2) {
			val = 4.50 * qtd;
		}
		else if(n1 == 3) {
			val = 5.00 * qtd;
		}
		else if(n1 == 4) {
			val = 2.00 * qtd;
		}
		else if(n1 == 5) {
			val = 1.50 * qtd;
		}
		
		System.out.printf("Total: R$ %.2f", val);
		
		sc.close();
	}

}
