package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.print("Hou many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #"+ i + ": ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
