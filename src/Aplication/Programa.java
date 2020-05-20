package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Quarto;



public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vect = new Quarto[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Quarto(nome, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
			
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
		}
		
			sc.close();
	}

	}}
