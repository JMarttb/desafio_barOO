package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Bill bill = new Bill();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sexo: ");
		char gender = sc.next().charAt(0);
		
		while (gender != 'f' && gender != 'F' && gender != 'm' && gender != 'M') {
			System.out.println("Digite \"F\" para feminino ou \"M\" para masculino: ");
			gender = sc.next().charAt(0);
		}
		bill.gender = gender;
		
		System.out.println("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();


		System.out.println(bill);

		sc.close();
	
		
	}

}
