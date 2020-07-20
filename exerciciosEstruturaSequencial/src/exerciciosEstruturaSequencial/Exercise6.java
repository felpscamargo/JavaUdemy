package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, C, tri, cir, tra, qua, ret;
		double pi = 3.14159;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		tri = (A * C) / 2;
		cir = C * C * (float) pi;
		tra = ((A + B) / 2) * C;
		qua = B * B;
		ret = A * B;
		
		System.out.printf("TRINAGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}

}
