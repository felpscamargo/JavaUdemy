package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, n1, cod2, n2;
		float val1, val2, soma;
		
		//12 1 5.30
		cod1 = sc.nextInt();
		n1 = sc.nextInt();
		val1 = sc.nextFloat();
		sc.nextLine();
		
		//16 2 5.10
		cod2 = sc.nextInt();
		n2 = sc.nextInt();
		val2 = sc.nextFloat();
		
		soma = (n1 * val1) + (n2 * val2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", soma);
		
		sc.close();
	}

}
