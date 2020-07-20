package exerciciosEstruturaFor;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 1; i <= qtd; i++) {
			int val = sc.nextInt();
			
			if(val >= 10 && val <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
				
		sc.close();
	}

}
