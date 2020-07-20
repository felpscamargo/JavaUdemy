package exerciciosEstruturaFor;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int cont = i;
			int quad = i * i;
			int cubo = i * i * i;
			
			System.out.println(cont +" "+ quad +" "+ cubo);
		}
		
		sc.close();
	}

}
