package application;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enu.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status =  OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productname = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			Product product = new Product(productname, price);
			
			System.out.print("Product quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println("\n");
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		sc.close();
	}

}
