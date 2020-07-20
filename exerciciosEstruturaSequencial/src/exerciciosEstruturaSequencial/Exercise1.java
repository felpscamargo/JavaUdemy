package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int soma = n1+n2;
		
		System.out.println("Soma = "+soma);
		sc.close();
	}

}
