package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n2 % n1 == 0 || n1 % n2 == 0) {
			System.out.println("Sao Multiplus");
		}
		else {
			System.out.println("Nao sao Multiplus");
		}
		
		sc.close();
	}

}
