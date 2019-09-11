package main;

import java.util.Scanner;

public class Main {

	/*
	 * Demana número de l'1 al 10.
	 * Si el número introduït està fora del rang torna a demanar.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introdueix un número entre l'1 i el 10:");
		int num = in.nextInt();
		
		// utilizo un bucle while y no un do-while para poder canviar la frase y "avisar" al usuario de su equivocación ya que si lo hace bien a la 1a no haria falta la primera ejecución del bucle en un do-while
		while (num < 1 || num > 10) {
			System.out.println("Eh! Ha de ser entre l'1 i el 10!");
			System.out.println("Introdueix-ne un altre:");
			num = in.nextInt();
		}
		
		System.out.println("Perfecte, el " + num + ".");
		in.close();
	}

}
