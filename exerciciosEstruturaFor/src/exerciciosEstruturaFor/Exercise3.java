package exerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			double x = sc.nextFloat();
			double y = sc.nextFloat();
			double z = sc.nextFloat();
			
			double media = (x * 2.0 + y * 3.0 + z * 5.0) / 10;
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
