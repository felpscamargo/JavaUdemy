package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hrs;
		float val, sal;
		
		num = sc.nextInt();
		hrs = sc.nextInt();
		val = sc.nextFloat();
		
		sal = hrs * val;
		
		System.out.println("NUMBER = "+ num);
		System.out.printf("SALARY = U$ %.2f", sal);
		
		sc.close();
	}

}
