package exerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		eStudent student = new eStudent();
		
		System.out.print("Student: ");
		student.name = sc.nextLine();
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();	
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing: %.2f POINTS %n"+ student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
