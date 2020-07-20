package exerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Alex Green
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		
		//3
		System.out.println("How many bedrooms are there in your house?");
		int n1 = sc.nextInt();
		
		//500.50
		System.out.println("Enter product price: ");
		float n2 = sc.nextFloat();
		
		// Green 21 1.73
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int age = sc.nextInt();
		float height = sc.nextFloat();
		
		System.out.println(name);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}

}
