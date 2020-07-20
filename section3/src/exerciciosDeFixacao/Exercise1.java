package exerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		eRectangle rectangle = new eRectangle();
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
