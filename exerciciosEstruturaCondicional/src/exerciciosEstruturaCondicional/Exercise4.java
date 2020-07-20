package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hri, hrf,dif;
		
		hri = sc.nextInt();
		hrf = sc.nextInt();

		if(hri < hrf) {
			dif = hrf - hri;
		}
		else {
			dif = 24 - hri + hrf;
		}
		
		System.out.println("O JOGO DUROU "+ dif +" HORA(S)");
		sc.close();
	}

}
