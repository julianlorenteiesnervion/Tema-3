package boletinarrays;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Array temps con 12 posiciones
		int temps[] = new int[12];
		
		// Le pedimos las 12 temperaturas de los 12 meses
		for (int i = 0; i < temps.length; i++) {
			System.out.print("Introduce la temperatura del mes " + (i+1) + ": ");
			temps[i] = reader.nextInt();
		}
		
		/* For each en el que value es el
		 * valor de la correspondiente posición */
		for (int value : temps) {
			// For para imprimir los asteriscos
			for (int i = 0; i < value; i++) {
				System.out.print(" *");
			}
			System.out.println(); // Salto de línea
		}
		
		reader.close();

	}

}
