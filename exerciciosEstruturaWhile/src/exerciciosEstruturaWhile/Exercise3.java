package exerciciosEstruturaWhile;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while (opcao != 4) {
			if(opcao == 1) {
				alcool++;
			}
			else if(opcao == 2) {
				gasolina++;
			}
			else if(opcao == 3) {
				diesel++;
			}
			else {
				System.out.println("Digite uma opcao valida");
			}
			opcao = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Alcool: "+gasolina);
		System.out.println("Alcool: "+diesel);
	
		sc.close();
	}

}
